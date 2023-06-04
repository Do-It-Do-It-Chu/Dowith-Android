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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.soopeach.dowith.ui.screen.done.DoneScreen
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.ui.screen.Screen.Companion.bottomNavigationItems
import com.soopeach.dowith.ui.screen.personal.PersonalTodoMainScreen
import com.soopeach.dowith.ui.screen.personal.PersonalTodoMoreScreen
import com.soopeach.dowith.ui.screen.team.CategorySelectScreen
import com.soopeach.dowith.ui.screen.team.PresentScreen
import com.soopeach.dowith.ui.screen.team.TeamTodoMainScreen
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun AppScreen() {

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.nestedScroll(rememberNestedScrollInteropConnection()),
        bottomBar = {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            if (currentDestination?.route in bottomNavigationItems.map { it.route }) {
                BottomNavigation(
                    backgroundColor = Color.White,
                ) {
                    bottomNavigationItems.forEach { screen ->
                        BottomNavigationItem(
                            icon = {
                                Icon(requireNotNull(screen.icon), contentDescription = null)
                            },
                            label = {
                                Text(
                                    text = stringResource(requireNotNull(screen.resourceId)),
                                    style = DoWithTypography.Caption1
                                )
                            },
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            selectedContentColor = DoWithColors.orange1000,
                            unselectedContentColor = DoWithColors.gray400
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = Screen.PersonalTodoMain.route,
            Modifier.padding(innerPadding)
        ) {

            composable(Screen.PersonalTodoMain.route) {
                PersonalTodoMainScreen(navController)
            }
            composable(Screen.TeamTodoMain.route) {
                TeamTodoMainScreen(navController)
            }
            composable(Screen.Done.route) {
                DoneScreen(navController)
            }

            composable(Screen.PersonalTodoMore.route) {
                PersonalTodoMoreScreen(navController)
            }

            composable(Screen.PresentScreen.route) {
                PresentScreen(navController)
            }

            composable(Screen.CategorySelectScreen.route) {
                CategorySelectScreen(navController)
            }

        }
    }
}