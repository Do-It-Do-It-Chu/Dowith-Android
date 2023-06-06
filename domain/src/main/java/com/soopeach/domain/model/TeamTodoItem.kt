package com.soopeach.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class TeamTodoItem(
    val recommendTodo: String,
    val teamUserDataList: List<TeamUserData>
)