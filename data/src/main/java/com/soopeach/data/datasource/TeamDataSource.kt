package com.soopeach.data.datasource

import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.response.TeamTodoCheckResponse

interface TeamDataSource {

    suspend fun getTeamInfoList(
        userId: Long,
    ): TeamInfoList

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