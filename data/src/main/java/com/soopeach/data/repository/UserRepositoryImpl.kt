package com.soopeach.data.repository

import com.soopeach.data.datasource.UserDataSource
import com.soopeach.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource
): UserRepository {

    override suspend fun getUserId(): Long {
        return userDataSource.getUserId()
    }

}