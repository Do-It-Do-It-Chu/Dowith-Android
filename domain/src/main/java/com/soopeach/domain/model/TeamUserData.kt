package com.soopeach.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class TeamUserData(
    val checked: Boolean,
    val nickname: String,
    val token: String,
    val userId: Int
)