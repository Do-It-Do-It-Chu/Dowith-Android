package com.soopeach.domain.model.response

import kotlinx.serialization.Serializable

@Serializable
data class FcmResponse(
    val isSuccess: Boolean
)
