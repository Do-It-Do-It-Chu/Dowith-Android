package com.soopeach.data.datasource

import com.soopeach.domain.model.TodoItem

interface TodoDataSource {

    suspend fun getTodayTodoItems(): List<TodoItem>

    suspend fun postTodoToggle(id: Long): TodoItem

    suspend fun putTodoContent(id: Long, content: String): TodoItem

    suspend fun deleteTodoItem(id: Long): Boolean

    suspend fun postTodoItem(content: String): TodoItem
}