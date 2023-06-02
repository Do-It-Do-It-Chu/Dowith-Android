package com.soopeach.data.datasource

import com.soopeach.domain.model.TodoItem
import retrofit2.Retrofit
import javax.inject.Inject

class TodoDataSourceImpl @Inject constructor(
    private val client: Retrofit
) : TodoDataSource {

    private var dummyItems = List(10) { TodoItem.DUMMY }

    override suspend fun getTodayTodoItems(): List<TodoItem> {
        // TODO: Call Api
        return dummyItems
    }

    override suspend fun postTodoToggle(id: Long): TodoItem {
        // TODO: Call Api
        dummyItems = dummyItems.map { if (it.id == id) it.copy(isChecked = it.isChecked.not()) else it }
        return dummyItems.first { it.id == id }
    }

    override suspend fun putTodoContent(id: Long, content: String): TodoItem {
        // TODO: Call Api
        dummyItems = dummyItems.map { if (it.id == id) it.copy(content = content) else it }
        return dummyItems.first { it.id == id }
    }

    override suspend fun deleteTodoItem(id: Long): Boolean {
        // TODO: Call Api
        dummyItems = dummyItems.filter { it.id != id }
        return true
    }
}