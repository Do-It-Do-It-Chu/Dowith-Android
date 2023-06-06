package com.soopeach.domain.repository

interface FcmRepository {

    suspend fun postToken(
        targetUserNickname: String,
        myNickname: String,
        targetUserFcmToken: String
    ): Boolean
}