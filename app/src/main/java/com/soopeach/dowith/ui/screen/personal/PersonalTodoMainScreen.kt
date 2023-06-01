package com.soopeach.dowith.ui.screen.personal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.SimplifiedTodoContainer
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.viewmodel.PersonalTodoMainState
import com.soopeach.dowith.viewmodel.PersonalTodoMainViewModel
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun PersonalTodoMainScreen(
    navController: NavController
) {

    val viewModel = hiltViewModel<PersonalTodoMainViewModel>()
    val state by viewModel.collectAsState()

    PersonalTodoMainContent(state) {
        viewModel.setTodoToggle(it)
    }

}

@Composable
fun PersonalTodoMainContent(
    state: PersonalTodoMainState,
    onTodoItemClicked: (Long) -> Unit = {}
) {
    Scaffold(
        topBar = {
            DoWithTopBar()
        }) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues = paddingValues)
                .padding(20.dp)

        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .background(DoWithColors.gray200)
            )

            Spacer(modifier = Modifier.height(54.dp))

            state.todayTodoItems.getDataOrNull()?.let { todoItems ->
                SimplifiedTodoContainer(todoItems.take(2), onTodoIconClicked = {
                    onTodoItemClicked(it)
                })
            }
        }
    }
}
