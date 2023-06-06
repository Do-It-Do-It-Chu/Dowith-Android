package com.soopeach.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class SimpleTeamTodoItem(
    val characterLevel: Int,
    val characterMaxLevel: Int,
    val createDate: String,
    val recommendTodo: String,
    val teamId: Int
)