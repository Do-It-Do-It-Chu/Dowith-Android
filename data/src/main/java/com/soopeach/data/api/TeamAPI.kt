package com.soopeach.data.api

import com.soopeach.domain.model.TeamInfoList
import com.soopeach.domain.model.TeamTodoItem
import com.soopeach.domain.model.request.TeamTodoCheckRequest
import com.soopeach.domain.model.response.TeamTodoCheckResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TeamAPI {

    @GET("/teamTodo/{userId}")
    suspend fun getTeamInfoList(
        @Path("userId") userId: Long,
    ): TeamInfoList

    @GET("/detail/{userId}/{teamId}")
    suspend fun getTeamTodoData(
        @Path("userId") userId: Long,
        @Path("teamId") teamId: Long,
    ): TeamTodoItem

    @POST("/teamTodo/isCheck")
    suspend fun checkTeamTodo(
        @Body teamTodoCheckRequest: TeamTodoCheckRequest
    ): TeamTodoCheckResponse
}