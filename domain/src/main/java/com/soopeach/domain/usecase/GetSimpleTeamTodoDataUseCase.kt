package com.soopeach.domain.usecase

import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetSimpleTeamTodoDataUseCase @Inject constructor(
    private val teamRepository: TeamRepository,
    private val getUserIdUseCase: GetUserIdUseCase
){
    suspend operator fun invoke(
        categoryId: Long,
        teamId: Long,
    ): SimpleTeamTodoItem {
        val userId = getUserIdUseCase()
        return teamRepository.getSimpleTeamTodoData(categoryId, userId, teamId)
    }
}