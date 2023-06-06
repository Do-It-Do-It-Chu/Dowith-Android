package com.soopeach.dowith.viewmodel.team

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.usecase.GetSimpleTeamTodoDataUseCase
import com.soopeach.dowith.model.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

sealed class TeamTodoMainSideEffect {

}

data class TeamTodoMainState(
    val todayTodoItem: UiState<SimpleTeamTodoItem> = UiState.Idle
)

@HiltViewModel
class TeamTodoMainViewModel @Inject constructor(
    private val getSimpleTeamTodoDataUseCase: GetSimpleTeamTodoDataUseCase
) : ViewModel(), ContainerHost<TeamTodoMainState, TeamTodoMainSideEffect> {

    override val container =
        container<TeamTodoMainState, TeamTodoMainSideEffect>(TeamTodoMainState())

    fun getTodayTodoItem() = intent {

        reduce {
            state.copy(todayTodoItem = UiState.Loading)
        }

        val todayTodoItem = getSimpleTeamTodoDataUseCase(1, 1)

        reduce {
            state.copy(todayTodoItem = UiState.Success(todayTodoItem))
        }
    }
}