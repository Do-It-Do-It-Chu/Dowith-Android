package com.soopeach.data.datasource

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserDataSourceImpl @Inject constructor(
    private val client: Retrofit
): UserDataSource {

    override suspend fun getUserId(): Long {
        // TODO: Call Api
        return 3L
    }
}