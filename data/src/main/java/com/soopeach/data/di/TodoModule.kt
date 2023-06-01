package com.soopeach.data.di

import com.soopeach.data.datasource.TodoDataSource
import com.soopeach.data.datasource.TodoDataSourceImpl
import com.soopeach.data.repository.TodoRepositoryImpl
import com.soopeach.domain.repository.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TodoModule {

    @Provides
    @Singleton
    fun provideTodoDataSource(retrofit: Retrofit): TodoDataSource = TodoDataSourceImpl(retrofit)

    @Provides
    @Singleton
    fun provideTodoRepository(dataSource: TodoDataSource): TodoRepository =
        TodoRepositoryImpl(dataSource)
}