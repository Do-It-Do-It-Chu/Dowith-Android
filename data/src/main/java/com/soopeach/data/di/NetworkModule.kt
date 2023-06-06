package com.soopeach.data.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    private val clientBuilder = OkHttpClient.Builder().apply {
        addInterceptor(
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        )
    }

    private val contentType = "application/json".toMediaType()

    @Provides
    @Singleton
    fun provideClient(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .client(clientBuilder.build()).build()
    }

    @Provides
    @Singleton
    @FCMClient
    fun provideFCMClient(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(FCM_BASE_URL)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .client(clientBuilder.build()).build()
    }

    companion object {
        private const val BASE_URL = "https://port-0-doit-backend-das6e2dlig0er28.sel4.cloudtype.app/"
        private const val FCM_BASE_URL = "https://us-central1-do-with.cloudfunctions.net/"
    }

}
