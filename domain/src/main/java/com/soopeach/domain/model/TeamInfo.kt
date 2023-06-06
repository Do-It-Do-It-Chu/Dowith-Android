package com.soopeach.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class TeamInfo(
    val characterLevel: Int,
    val characterMaxLevel: Int,
    val createDate: String,
    val recommendTodo: String,
    val teamId: Int
)