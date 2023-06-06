package com.soopeach.data.repository

import com.soopeach.data.datasource.TeamDataSource
import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.response.TeamTodoCheckResponse
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamRepositoryImpl @Inject constructor(
    private val teamDataSource: TeamDataSource
): TeamRepository {
    override suspend fun getTeamInfoList(userId: Long): TeamInfoList {
        return teamDataSource.getTeamInfoList(userId)
    }

    override suspend fun getTeamTodoData(userId: Long, teamId: Long): TeamTodoItem {
        return teamDataSource.getTeamTodoData(userId, teamId)
    }

    override suspend fun postTeamTodoCheck(
        checkTodo: Boolean,
        teamId: Long,
        userId: Long
    ): TeamTodoCheckResponse {
        return teamDataSource.postTeamTodoCheck(
            checkTodo,
            teamId,
            userId
        )
    }
}