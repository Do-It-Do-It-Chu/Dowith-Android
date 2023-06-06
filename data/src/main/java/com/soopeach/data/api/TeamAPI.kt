package com.soopeach.data.api

import com.soopeach.domain.model.SimpleTeamTodoItem
import retrofit2.http.GET
import retrofit2.http.Path

interface TeamAPI {

    @GET("/teamTodo/{categoryId}/{userId}/{teamId}")
    suspend fun getSimpleTeamTodoData(
        @Path("categoryId") categoryId: Long,
        @Path("userId") userId: Long,
        @Path("teamId") teamId: Long,
    ): SimpleTeamTodoItem
}