package com.soopeach.domain.repository

import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.response.TeamTodoCheckResponse

interface TeamRepository {

    suspend fun getSimpleTeamTodoData(
        categoryId: Long,
        userId: Long,
        teamId: Long,
    ): SimpleTeamTodoItem

    suspend fun getTeamTodoData(
        userId: Long,
        teamId: Long,
    ): TeamTodoItem

    suspend fun postTeamTodoCheck(
        checkTodo: Boolean,
        teamId: Long,
        userId: Long,
    ): TeamTodoCheckResponse
}