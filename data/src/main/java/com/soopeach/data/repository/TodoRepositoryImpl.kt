package com.soopeach.data.repository

import com.soopeach.data.datasource.TodoDataSource
import com.soopeach.domain.model.TodoItem
import com.soopeach.domain.repository.TodoRepository
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDataSource: TodoDataSource
): TodoRepository {
    override suspend fun getTodayTodoItems(): List<TodoItem> {
        return todoDataSource.getTodayTodoItems()
    }

    override suspend fun postTodoToggle(id: Long): TodoItem {
        return todoDataSource.postTodoToggle(id)
    }

    override suspend fun putTodoContent(id: Long, content: String): TodoItem {
        return todoDataSource.putTodoContent(id, content)
    }

    override suspend fun deleteTodoItem(id: Long): Boolean {
        return todoDataSource.deleteTodoItem(id)
    }

    override suspend fun postTodoItem(content: String): TodoItem {
        return todoDataSource.postTodoItem(content)
    }
}