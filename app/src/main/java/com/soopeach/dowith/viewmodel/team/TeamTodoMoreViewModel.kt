package com.soopeach.dowith.viewmodel.team

import androidx.lifecycle.ViewModel
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.TeamUserData
import com.soopeach.domain.usecase.GetTeamTodoItemUseCase
import com.soopeach.domain.usecase.GetUserIdUseCase
import com.soopeach.domain.usecase.PostTeamTodoCheckUseCase
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
    val teamTodoItem: UiState<TeamTodoItem> = UiState.Idle,
    val myUserId: UiState<Long> = UiState.Idle,
    val myUserData: UiState<TeamUserData> = UiState.Idle
)

@HiltViewModel
class TeamTodoMoreViewModel @Inject constructor(
    private val getUserIdUseCase: GetUserIdUseCase,
    private val getTeamTodoItemUseCase: GetTeamTodoItemUseCase,
    private val postTeamTodoCheckUseCase: PostTeamTodoCheckUseCase,
) : ViewModel(), ContainerHost<TeamTodoMoreState, TeamTodoMoreSideEffect> {

    override val container =
        container<TeamTodoMoreState, TeamTodoMoreSideEffect>(TeamTodoMoreState())

    init {
        intent {
            val myUserId = getUserIdUseCase()
            reduce {
                state.copy(myUserId = UiState.Success(myUserId))
            }
        }
    }

    fun getTeamTodoData() = intent {

        reduce {
            state.copy(teamTodoItem = UiState.Loading)
        }
        val teamTodoItem = getTeamTodoItemUseCase()
        reduce {
            state.copy(
                teamTodoItem = UiState.Success(teamTodoItem),
                myUserData = UiState.Success(
                    teamTodoItem.teamUserDataList.first {
                        it.userId == (state.myUserId.getDataOrNull()?.toInt() ?: -1)
                    }
                ))
        }
    }

    fun postTeamTodoCheck() = intent {

        val postTeamTodoCheckResponse =
            postTeamTodoCheckUseCase(requireNotNull(state.myUserData.getDataOrNull()).checked.not())
        reduce {
            state.copy(
                myUserData = UiState.Success(
                    previousMyUserData.copy(checked = postTeamTodoCheckResponse.checkTodo)
                )
            )
        }
    }

    private val previousMyUserData
        get() = requireNotNull(container.stateFlow.value.myUserData.getDataOrNull())

}