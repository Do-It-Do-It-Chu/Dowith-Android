package com.soopeach.data.di

import com.soopeach.data.api.FcmAPI
import com.soopeach.data.datasource.FcmDataSource
import com.soopeach.data.datasource.FcmDataSourceImpl
import com.soopeach.data.repository.FcmRepositoryImpl
import com.soopeach.domain.repository.FcmRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FcmModule {

    @Provides
    @Singleton
    fun provideFcmDataSource(api: FcmAPI): FcmDataSource = FcmDataSourceImpl(api)

    @Provides
    @Singleton
    fun provideFcmRepository(dataSource: FcmDataSource): FcmRepository =
        FcmRepositoryImpl(dataSource)

}