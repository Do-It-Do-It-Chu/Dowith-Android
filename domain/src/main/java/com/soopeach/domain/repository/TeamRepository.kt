package com.soopeach.domain.repository

import com.soopeach.domain.model.SimpleTeamTodoItem

interface TeamRepository {

    suspend fun getSimpleTeamTodoData(
        categoryId: Long,
        userId: Long,
        teamId: Long,
    ): SimpleTeamTodoItem
}