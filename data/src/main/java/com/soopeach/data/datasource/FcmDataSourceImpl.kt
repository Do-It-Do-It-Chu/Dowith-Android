package com.soopeach.data.datasource

import com.soopeach.data.api.FcmAPI
import com.soopeach.domain.model.request.FcmRequest
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FcmDataSourceImpl @Inject constructor(
    private val fcmAPI: FcmAPI
) : FcmDataSource {
    override suspend fun postToken(
        targetUserNickname: String,
        myNickname: String,
        targetUserFcmToken: String
    ): Boolean {
        return fcmAPI.postToken(
            FcmRequest.create(
                targetUserNickname,
                myNickname,
                targetUserFcmToken
            )
        ).isSuccess
    }

}