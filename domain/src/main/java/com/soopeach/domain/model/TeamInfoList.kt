package com.soopeach.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class TeamInfoList(
    val teamInfoList: List<TeamInfo>
)