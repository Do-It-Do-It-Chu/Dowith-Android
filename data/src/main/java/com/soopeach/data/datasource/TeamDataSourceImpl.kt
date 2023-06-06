package com.soopeach.data.datasource

import com.soopeach.data.api.TeamAPI
import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.request.TeamTodoCheckRequest
import com.soopeach.domain.model.response.TeamTodoCheckResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamDataSourceImpl @Inject constructor(
    private val teamAPI: TeamAPI
) : TeamDataSource {
    override suspend fun getSimpleTeamTodoData(
        categoryId: Long,
        userId: Long,
        teamId: Long
    ): SimpleTeamTodoItem {
        // TODO: categoryId, teamId
        return teamAPI.getSimpleTeamTodoData(1, userId, 1)
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