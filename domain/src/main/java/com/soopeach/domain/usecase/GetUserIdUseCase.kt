package com.soopeach.domain.usecase

import com.soopeach.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetUserIdUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend operator fun invoke(): Long {
        return userRepository.getUserId()
    }
}