package com.soopeach.data.di

import com.soopeach.data.api.TeamAPI
import com.soopeach.data.datasource.TeamDataSource
import com.soopeach.data.datasource.TeamDataSourceImpl
import com.soopeach.data.repository.TeamRepositoryImpl
import com.soopeach.domain.repository.TeamRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TeamModule {

    @Provides
    @Singleton
    fun provideTeamDataSource(api: TeamAPI): TeamDataSource = TeamDataSourceImpl(api)

    @Provides
    @Singleton
    fun provideTeamRepository(dataSource: TeamDataSource): TeamRepository =
        TeamRepositoryImpl(dataSource)

}