package com.soopeach.data.repository

import com.soopeach.data.datasource.TeamDataSource
import com.soopeach.domain.model.SimpleTeamTodoItem
import com.soopeach.domain.repository.TeamRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamRepositoryImpl @Inject constructor(
    private val teamDataSource: TeamDataSource
): TeamRepository {
    override suspend fun getSimpleTeamTodoData(categoryId: Long, userId: Long, teamId: Long): SimpleTeamTodoItem {
        return teamDataSource.getSimpleTeamTodoData(categoryId, userId, teamId)
    }
}