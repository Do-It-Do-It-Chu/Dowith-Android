package com.soopeach.domain.usecase

import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetTeamTodoItemUseCase @Inject constructor(
    private val teamRepository: TeamRepository,
    private val getUserIdUseCase: GetUserIdUseCase
) {

    suspend operator fun invoke(): TeamTodoItem {
        // TODO: teamId
        val userId = getUserIdUseCase()
        return teamRepository.getTeamTodoData(userId, 1)
    }
}