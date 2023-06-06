package com.soopeach.domain.usecase

import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetTeamInfoListUseCase @Inject constructor(
    private val teamRepository: TeamRepository,
    private val getUserIdUseCase: GetUserIdUseCase
){
    suspend operator fun invoke(): TeamInfoList {
        val userId = getUserIdUseCase()
        return teamRepository.getTeamInfoList(userId)
    }
}