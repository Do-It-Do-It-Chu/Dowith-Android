package com.soopeach.domain.repository

interface UserRepository {

    suspend fun getUserId(): Long

}