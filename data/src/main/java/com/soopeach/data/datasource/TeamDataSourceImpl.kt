package com.soopeach.data.datasource

import com.soopeach.data.api.TeamAPI
import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.request.TeamTodoCheckRequest
import com.soopeach.domain.model.response.TeamTodoCheckResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamDataSourceImpl @Inject constructor(
    private val teamAPI: TeamAPI
) : TeamDataSource {
    override suspend fun getTeamInfoList(
        userId: Long,
    ): TeamInfoList {
        return teamAPI.getTeamInfoList(userId)
    }

    override suspend fun getTeamTodoData(userId: Long, teamId: Long): TeamTodoItem {
        return teamAPI.getTeamTodoData(userId, teamId)
    }

    override suspend fun postTeamTodoCheck(
        checkTodo: Boolean,
        teamId: Long,
        userId: Long
    ): TeamTodoCheckResponse {
        return teamAPI.checkTeamTodo(
            TeamTodoCheckRequest(
                checkTodo,
                teamId,
                userId
            )
        )
    }

}