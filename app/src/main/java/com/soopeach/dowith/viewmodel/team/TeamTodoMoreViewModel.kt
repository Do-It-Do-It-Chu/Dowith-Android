package com.soopeach.dowith.viewmodel.team

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.usecase.GetTeamTodoItemUseCase
import com.soopeach.dowith.model.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

sealed class TeamTodoMoreSideEffect {

}

data class TeamTodoMoreState(
    val teamTodoItem: UiState<TeamTodoItem> = UiState.Idle
)

@HiltViewModel
class TeamTodoMoreViewModel @Inject constructor(
    private val getTeamTodoItemUseCase: GetTeamTodoItemUseCase
) : ViewModel(), ContainerHost<TeamTodoMoreState, TeamTodoMoreSideEffect> {

    override val container =
        container<TeamTodoMoreState, TeamTodoMoreSideEffect>(TeamTodoMoreState())

    fun getTeamTodoData() = intent {

        reduce {
            state.copy(teamTodoItem = UiState.Loading)
        }
        val teamTodoItem = getTeamTodoItemUseCase()
        reduce {
            state.copy(teamTodoItem = UiState.Success(teamTodoItem))
        }
    }

}