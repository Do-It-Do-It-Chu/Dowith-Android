package com.soopeach.domain.model.response

import kotlinx.serialization.Serializable

@Serializable
data class TeamTodoCheckResponse(
    val checkTodo: Boolean,
    val teamId: Long,
    val userId: Long
)