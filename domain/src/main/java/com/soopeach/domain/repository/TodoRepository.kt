package com.soopeach.domain.repository

import com.soopeach.domain.model.TodoItem

interface TodoRepository {

    suspend fun getTodayTodoItems(): List<TodoItem>

    suspend fun postTodoToggle(id: Long): TodoItem

    suspend fun putTodoContent(id: Long, content: String): TodoItem

    suspend fun deleteTodoItem(id: Long): Boolean
}