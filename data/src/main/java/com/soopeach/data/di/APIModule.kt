package com.soopeach.data.di

import com.soopeach.data.api.FcmAPI
import com.soopeach.data.api.TeamAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class APIModule {

    @Provides
    @Singleton
    fun provideTeamAPI(client: Retrofit): TeamAPI = client.create(TeamAPI::class.java)

    @Provides
    @Singleton
    fun provideFcmAPI(@FCMClient client: Retrofit): FcmAPI = client.create(FcmAPI::class.java)
}