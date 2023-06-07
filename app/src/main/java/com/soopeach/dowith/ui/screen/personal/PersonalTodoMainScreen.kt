package com.soopeach.dowith.ui.screen.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.soopeach.dowith.R
import com.soopeach.dowith.model.DoWithCharacter
import com.soopeach.dowith.ui.component.BalloonText
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.SimplifiedTodoContainer
import com.soopeach.dowith.ui.component.TodoItemComposable
import com.soopeach.dowith.ui.component.bottomsheet.TodoContainerModalBottomSheetLayout
import com.soopeach.dowith.ui.component.bottomsheet.TodoContainerModalBottomSheetType
import com.soopeach.dowith.ui.component.progressbar.LevelIndicator
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.viewmodel.PersonalTodoMainState
import com.soopeach.dowith.viewmodel.PersonalTodoMainViewModel
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun PersonalTodoMainScreen(
    navController: NavController
) {

    val viewModel = hiltViewModel<PersonalTodoMainViewModel>()
    val state by viewModel.collectAsState()

    LaunchedEffect(true) {
        viewModel.getTodayTodoItems()
    }

    PersonalTodoMainContent(
        state,
        onTodoItemClicked = {
            viewModel.setTodoToggle(it)
        },
        onMoreClicked = {
            navController.navigate(Screen.PersonalTodoMore.route)
        },
        onCompleteButtonClicked = { todoContents ->
            todoContents.forEach { content ->
                viewModel.postTodoItem(content)
            }
        }
    )

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PersonalTodoMainContent(
    state: PersonalTodoMainState,
    onTodoItemClicked: (Long) -> Unit = {},
    onMoreClicked: () -> Unit = {},
    onCompleteButtonClicked: (List<String>) -> Unit = {}
) {

    val bottomSheetScope = rememberCoroutineScope()

    val bottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded },
        skipHalfExpanded = true
    )

    TodoContainerModalBottomSheetLayout(
        bottomSheetType = TodoContainerModalBottomSheetType.Write,
        coroutineScope = bottomSheetScope,
        modalSheetState = bottomSheetState,
        onCompleteButtonClicked = {
            onCompleteButtonClicked(it)
        }
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.background), contentDescription = "배경",
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                DoWithTopBar()

                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.BottomStart
                ) {

                    LevelIndicator(50f)

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        BalloonText("안녕하세요 반가워요.")

                        Spacer(modifier = Modifier.height(14.dp))

                        Image(
                            painter = painterResource(id = DoWithCharacter.Bell.BELL_SECOND.imageResource),
                            contentDescription = ""
                        )

                    }
                }

                Spacer(modifier = Modifier.height(54.dp))

                state.todayTodoItems.getDataOrNull()?.let { todoItems ->

                    SimplifiedTodoContainer(
                        onMoreClicked = onMoreClicked
                    ) {
                        if (todoItems.isEmpty()) {
                            DoWithButton(text = "작성하러 가기") {
                                bottomSheetScope.launch {
                                    bottomSheetState.show()
                                }
                            }
                        } else {
                            todoItems.forEach {
                                TodoItemComposable(
                                    todoItem = it,
                                    modifier = Modifier.fillMaxWidth(),
                                    isMoreIconVisible = false,
                                    onTodoIconClicked = {
                                        onTodoItemClicked(it.id)
                                    }
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}

