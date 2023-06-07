package com.soopeach.dowith.viewmodel.team

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.usecase.GetTeamInfoListUseCase
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
    val myTeamInfoList: UiState<TeamInfoList> = UiState.Idle,
    // flag for test
    val hasTeam: Boolean = false
)

@HiltViewModel
class TeamTodoMainViewModel @Inject constructor(
    private val getTeamInfoListUseCase: GetTeamInfoListUseCase
) : ViewModel(), ContainerHost<TeamTodoMainState, TeamTodoMainSideEffect> {

    override val container =
        container<TeamTodoMainState, TeamTodoMainSideEffect>(TeamTodoMainState())

    fun getMyTeamInfoList() = intent {

        reduce {
            state.copy(myTeamInfoList = UiState.Loading)
        }

        val teamInfoList = getTeamInfoListUseCase()

        reduce {
            state.copy(myTeamInfoList = UiState.Success(teamInfoList))
        }
    }

    fun joinTeam() = intent {
        reduce {
            state.copy(hasTeam = true)
        }
    }
}