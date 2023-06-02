package com.soopeach.dowith.ui.screen.personal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.soopeach.domain.model.TodoItem
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.NicknameTodoListExplainText
import com.soopeach.dowith.ui.component.bottomsheet.TodoContainerModalBottomSheetLayout
import com.soopeach.dowith.ui.component.bottomsheet.TodoContainerModalBottomSheetType
import com.soopeach.dowith.ui.component.TodoItemComposable
import com.soopeach.dowith.ui.icons.CheckBoxIcon
import com.soopeach.dowith.ui.icons.PencilIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import com.soopeach.dowith.viewmodel.PersonalTodoMoreState
import com.soopeach.dowith.viewmodel.PersonalTodoMoreViewModel
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun PersonalTodoMoreScreen(
    navController: NavController,
) {

    val viewModel = hiltViewModel<PersonalTodoMoreViewModel>()
    val state by viewModel.collectAsState()

    LaunchedEffect(true) {
        viewModel.getTodayTodoItems()
    }

    PersonalTodoMoreContent(
        state = state,
        onTopBarNavigationIconClicked = {
            navController.popBackStack()
        },
        onTodoItemClicked = {
            viewModel.setTodoToggle(it)
        },
        onKeyboardActionClicked = { id, content ->
            viewModel.modifyTodoContent(id, content)
        },
        onTodoContentChanged = { id, content ->
            viewModel.modifyTodoContentInMemory(id, content)
        }
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PersonalTodoMoreContent(
    state: PersonalTodoMoreState,
    onTopBarNavigationIconClicked: () -> Unit = {},
    onTodoItemClicked: (Long) -> Unit = {},
    onKeyboardActionClicked: (Long, String) -> Unit,
    onTodoContentChanged: (Long, String) -> Unit,
) {

    val focusState = LocalFocusManager.current

    val focusRequester = FocusRequester()

    var targetTodoItemId by remember {
        mutableStateOf(TodoItem.NOT_SELECTED)
    }
    var bottomSheetType: TodoContainerModalBottomSheetType by remember {
        mutableStateOf(TodoContainerModalBottomSheetType.More)
    }
    val bottomSheetScope = rememberCoroutineScope()
    val bottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded },
        skipHalfExpanded = false
    )

    state.todayTodoItems.getDataOrNull()?.let { todoItems ->
        Scaffold(
            topBar = {
                DoWithTopBar(
                    navigationIcon = {
                        Icon(
                            modifier = Modifier.clickable {
                                onTopBarNavigationIconClicked()
                            },
                            imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = "뒤로가기",
                        )
                    }
                )
            }
        ) { paddingValues ->
            TodoContainerModalBottomSheetLayout(
                bottomSheetType,
                bottomSheetScope,
                bottomSheetState,
                onModifyButtonClicked = {
                    focusRequester.requestFocus()
                    bottomSheetScope.launch {
                        bottomSheetState.hide()
                    }
                },
                onDeleteButtonClicked = {

                }
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .padding(horizontal = 20.dp)
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    // TODO: User name
                    NicknameTodoListExplainText(nickname = "두잇츄")

                    Spacer(modifier = Modifier.height(18.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(DoWithColors.gray100)

                    ) {

                        Column(
                            modifier = Modifier
                                .matchParentSize()
                                .padding(20.dp)
                        ) {

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                            ) {

                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(3.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        CheckBoxIcon, contentDescription = "체크박스 아이콘",
                                        tint = DoWithColors.orange1000
                                    )
                                    Text(
                                        text = "오늘의 할 일!",
                                        style = DoWithTypography.Title3.copy(DoWithColors.gray800)
                                    )
                                }

                                Row(
                                    modifier = Modifier.clickable {
                                        bottomSheetType = TodoContainerModalBottomSheetType.Write
                                        bottomSheetScope.launch {
                                            bottomSheetState.show()
                                        }
                                    },
                                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        PencilIcon, contentDescription = "작성하기 아이콘",
                                        tint = DoWithColors.gray500
                                    )
                                    Text(
                                        text = "작성하기",
                                        style = DoWithTypography.Body3.copy(DoWithColors.gray500)
                                    )
                                }

                            }

                            Spacer(modifier = Modifier.height(28.dp))

                            LazyColumn(
                                verticalArrangement = Arrangement.spacedBy(16.dp)
                            ) {

                                todoItems.forEach { todoItem ->

                                    item {

                                        TodoItemComposable(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .focusRequester(focusRequester)
                                                .onFocusChanged {},
                                            todoItem = todoItem,
                                            isMoreIconVisible = true,
                                            isEditable = targetTodoItemId == todoItem.id,
                                            onTodoIconClicked = {
                                                onTodoItemClicked(todoItem.id)
                                            },
                                            onMoreIconClicked = {
                                                targetTodoItemId = todoItem.id
                                                bottomSheetType =
                                                    TodoContainerModalBottomSheetType.More
                                                bottomSheetScope.launch {
                                                    bottomSheetState.show()
                                                }
                                            },
                                            onKeyboardActionClicked = {
                                                focusState.clearFocus()
                                                onKeyboardActionClicked(
                                                    todoItem.id,
                                                    todoItem.content
                                                )
                                                targetTodoItemId = TodoItem.NOT_SELECTED
                                            }
                                        ) { changedText ->
                                            onTodoContentChanged(todoItem.id, changedText)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}