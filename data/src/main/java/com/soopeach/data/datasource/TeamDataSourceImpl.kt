package com.soopeach.data.datasource

import com.soopeach.data.api.TeamAPI
import com.soopeach.domain.model.SimpleTeamTodoItem
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamDataSourceImpl @Inject constructor(
    private val teamAPI: TeamAPI
): TeamDataSource {
    override suspend fun getSimpleTeamTodoData(categoryId: Long, userId: Long, teamId: Long): SimpleTeamTodoItem {
        // TODO: categoryId, teamId
        return teamAPI.getSimpleTeamTodoData(1, userId, 1)
    }
}