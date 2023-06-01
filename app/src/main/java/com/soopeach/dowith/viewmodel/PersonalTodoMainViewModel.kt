package com.soopeach.dowith.viewmodel

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.TodoItem
import com.soopeach.domain.usecase.GetTodayTodoItemsUseCase
import com.soopeach.domain.usecase.PostTodoToggleUseCase
import com.soopeach.dowith.model.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

sealed class PersonalTodoMainSideEffect {

}

data class PersonalTodoMainState(
    val todayTodoItems: UiState<List<TodoItem>> = UiState.Idle
)

@HiltViewModel
class PersonalTodoMainViewModel @Inject constructor(
    private val getTodayTodoItemsUseCase: GetTodayTodoItemsUseCase,
    private val postTodoToggleUseCase: PostTodoToggleUseCase
) : ViewModel(),
    ContainerHost<PersonalTodoMainState, PersonalTodoMainSideEffect> {

    override val container =
        container<PersonalTodoMainState, PersonalTodoMainSideEffect>(PersonalTodoMainState())

    init {
        getTodayTodoItems()
    }

    private fun getTodayTodoItems() = intent {
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
        postTodoToggleUseCase(id)
        reduce {
            val previousTodoItems = state.todayTodoItems.getDataOrNull() ?: emptyList()
            state.copy(todayTodoItems = UiState.Success(
                previousTodoItems.map {
                    if (it.id == id) it.copy(isChecked = it.isChecked.not()) else it
                }
            ))
        }
    }
}