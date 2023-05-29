package com.soopeach.dowith.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.soopeach.dowith.ui.screen.done.DoneScreen
import com.soopeach.dowith.ui.screen.personal.PersonalTodoScreen
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.ui.screen.Screen.Companion.bottomNavigationItems
import com.soopeach.dowith.ui.screen.team.TeamTodoScreen

@Composable
fun AppScreen() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            if (currentDestination?.route in bottomNavigationItems.map { it.route }) {
                BottomNavigation() {
                    bottomNavigationItems.forEach { screen ->
                        BottomNavigationItem(
                            icon = {
                                Icon(requireNotNull(screen.icon), contentDescription = null)
                            },
                            label = { Text(stringResource(requireNotNull(screen.resourceId))) },
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = Screen.PersonalTodo.route,
            Modifier.padding(innerPadding)
        ) {

            composable(Screen.PersonalTodo.route) {
                PersonalTodoScreen(navController)
            }
            composable(Screen.TeamTodo.route) {
                TeamTodoScreen(navController)
            }
            composable(Screen.Done.route) {
                DoneScreen(navController)
            }

        }
    }
}