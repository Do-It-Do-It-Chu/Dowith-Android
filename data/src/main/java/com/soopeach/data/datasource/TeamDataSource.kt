package com.soopeach.data.datasource

import com.soopeach.domain.model.SimpleTeamTodoItem

interface TeamDataSource {

    suspend fun getSimpleTeamTodoData(
        categoryId: Long,
        userId: Long,
        teamId: Long,
    ): SimpleTeamTodoItem

}