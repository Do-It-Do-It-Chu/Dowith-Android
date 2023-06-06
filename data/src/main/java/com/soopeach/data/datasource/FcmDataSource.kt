package com.soopeach.data.datasource

interface FcmDataSource {

    suspend fun postToken(
        targetUserNickname: String,
        myNickname: String,
        targetUserFcmToken: String
    ) : Boolean
}