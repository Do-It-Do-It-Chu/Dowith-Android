package com.soopeach.data.datasource

import com.soopeach.domain.model.TodoItem
import retrofit2.Retrofit
import javax.inject.Inject

class TodoDataSourceImpl @Inject constructor(
    private val client: Retrofit
) : TodoDataSource {
    override suspend fun getTodayTodoItems(): List<TodoItem> {
        // TODO: Call Api
        return List(10) { TodoItem.DUMMY }
    }
}