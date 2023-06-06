package com.soopeach.domain.usecase

import com.soopeach.domain.model.response.TeamTodoCheckResponse
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostTeamTodoCheckUseCase @Inject constructor(
    private val getUserIdUseCase: GetUserIdUseCase,
    private val teamRepository: TeamRepository
) {
    suspend operator fun invoke(isChecked: Boolean): TeamTodoCheckResponse {
        // TODO: teamId
        val userId = getUserIdUseCase()
        return teamRepository.postTeamTodoCheck(
            userId = userId,
            teamId = 1,
            checkTodo = isChecked
        )
    }
}