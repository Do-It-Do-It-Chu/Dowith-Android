package com.soopeach.domain.model.request

import kotlinx.serialization.Serializable

@Serializable
data class TeamTodoCheckRequest(
    val checkTodo: Boolean,
    val teamId: Long,
    val userId: Long
)