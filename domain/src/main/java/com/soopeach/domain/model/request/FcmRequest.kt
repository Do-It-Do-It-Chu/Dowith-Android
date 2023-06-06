package com.soopeach.domain.model.request

import kotlinx.serialization.Serializable


@Serializable
data class FcmRequest (
    val notification: Notification,
    val token: String
) {
    companion object {
        fun create(
            targetUserNickname: String,
            myNickname: String,
            token: String
        ) = FcmRequest(
            notification = Notification(
                title = "DoWith에서 온 메시지",
                body = "${myNickname}님이 ${targetUserNickname}님을 걱정하고 있어요!"
            ),
            token = token
        )
    }
}

@Serializable
data class Notification(
    val title: String,
    val body: String
)