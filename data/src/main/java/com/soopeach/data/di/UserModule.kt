package com.soopeach.data.di

import com.soopeach.data.datasource.UserDataSource
import com.soopeach.data.datasource.UserDataSourceImpl
import com.soopeach.data.repository.UserRepositoryImpl
import com.soopeach.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UserModule {

    @Provides
    @Singleton
    fun provideUserDataSource(retrofit: Retrofit): UserDataSource = UserDataSourceImpl(retrofit)

    @Provides
    @Singleton
    fun provideUserRepository(dataSource: UserDataSource): UserRepository =
        UserRepositoryImpl(dataSource)
}