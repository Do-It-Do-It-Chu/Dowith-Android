package com.soopeach.domain.usecase

import com.soopeach.domain.repository.FcmRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostNotificationUseCase @Inject constructor(
    private val fcmRepository: FcmRepository
) {

    suspend operator fun invoke(
        targetUserNickname: String,
        myNickname: String,
        targetUserFcmToken: String
    ) = fcmRepository.postToken(targetUserNickname, myNickname, targetUserFcmToken)

}