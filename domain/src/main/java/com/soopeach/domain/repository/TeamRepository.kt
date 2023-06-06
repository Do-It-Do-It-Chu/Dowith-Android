package com.soopeach.domain.repository

import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.model.TeamTodoItem

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
}