package com.soopeach.data.repository

import com.soopeach.data.datasource.FcmDataSource
import com.soopeach.domain.repository.FcmRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FcmRepositoryImpl @Inject constructor(
    private val fcmDataSource: FcmDataSource,
): FcmRepository {

    override suspend fun postToken(
        targetUserNickname: String,
        myNickname: String,
        targetUserFcmToken: String
    ): Boolean {
        return fcmDataSource.postToken(targetUserNickname, myNickname, targetUserFcmToken)
    }
}