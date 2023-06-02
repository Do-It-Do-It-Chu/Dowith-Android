package com.soopeach.dowith.viewmodel

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.TodoItem
import com.soopeach.domain.usecase.DeleteTodoUseCase
import com.soopeach.domain.usecase.GetTodayTodoItemsUseCase
import com.soopeach.domain.usecase.ModifyTodoContentUseCase
import com.soopeach.domain.usecase.PostTodoToggleUseCase
import com.soopeach.domain.usecase.PostTodoUseCase
import com.soopeach.dowith.model.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

sealed class PersonalTodoMoreSideEffect {

}

data class PersonalTodoMoreState(
    val todayTodoItems: UiState<List<TodoItem>> = UiState.Idle
)

@HiltViewModel
class PersonalTodoMoreViewModel @Inject constructor(
    private val getTodayTodoItemsUseCase: GetTodayTodoItemsUseCase,
    private val postTodoToggleUseCase: PostTodoToggleUseCase,
    private val modifyTodoContentUseCase: ModifyTodoContentUseCase,
    private val deleteTodoUseCase: DeleteTodoUseCase,
    private val postTodoUseCase: PostTodoUseCase
) : ViewModel(), ContainerHost<PersonalTodoMoreState, PersonalTodoMoreSideEffect> {

    override val container =
        container<PersonalTodoMoreState, PersonalTodoMoreSideEffect>(PersonalTodoMoreState())

    fun getTodayTodoItems() = intent {
        reduce {
            state.copy(todayTodoItems = UiState.Loading)
        }
        val todoItems = getTodayTodoItemsUseCase()
        reduce {
            state.copy(todayTodoItems = UiState.Success(todoItems))
        }
    }

    // TODO: Todo Item Toggle UseCase
    fun setTodoToggle(id: Long) = intent {

        // TODO: Error Handling
        val toggleChangedPost = postTodoToggleUseCase(id)
        reduce {
            state.copy(todayTodoItems = UiState.Success(
                previousTodoItems.map {
                    if (it.id == toggleChangedPost.id) toggleChangedPost else it
                }
            ))
        }
    }

    fun modifyTodoContentInMemory(id: Long, content: String) = intent {
        reduce {
            state.copy(todayTodoItems = UiState.Success(
                previousTodoItems.map {
                    if (it.id == id) it.copy(content = content) else it
                }
            ))
        }
    }

    fun modifyTodoContent(id: Long, content: String) = intent {
        val modifiedTodoItem = modifyTodoContentUseCase(id, content)
        reduce {
            state.copy(todayTodoItems = UiState.Success(
                previousTodoItems.map {
                    if (it.id == id) modifiedTodoItem else it
                }
            ))
        }
    }

    // TODO: Todo Item Delete
    fun deleteTodoItem(id: Long) = intent {
        deleteTodoUseCase(id).let { isDeleted ->
            if (isDeleted) {
                getTodayTodoItems()
            }
        }
    }

    fun postTodoItem(content: String) = intent {
        val newTodoItem = postTodoUseCase(content)
        reduce {
            state.copy(
                todayTodoItems = UiState.Success(
                    previousTodoItems + newTodoItem
                )
            )
        }
    }

    private val previousTodoItems: List<TodoItem>
        get() = container.stateFlow.value.todayTodoItems.getDataOrNull() ?: emptyList()
}