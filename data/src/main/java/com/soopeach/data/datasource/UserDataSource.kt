package com.soopeach.data.datasource

interface UserDataSource {

    suspend fun getUserId(): Long

}