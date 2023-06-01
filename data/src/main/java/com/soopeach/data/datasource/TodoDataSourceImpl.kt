package com.soopeach.data.datasource

import com.soopeach.domain.model.TodoItem
import retrofit2.Retrofit
import javax.inject.Inject

class TodoDataSourceImpl @Inject constructor(
    private val client: Retrofit
) : TodoDataSource {

    private val dummyItems = List(10) { TodoItem.DUMMY }

    override suspend fun getTodayTodoItems(): List<TodoItem> {
        // TODO: Call Api
        return dummyItems
    }

    override suspend fun postTodoToggle(id: Long): TodoItem {
        // TODO: Call Api
        return dummyItems.first { it.id == id }
    }
}