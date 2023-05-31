package com.soopeach.domain.repository

import com.soopeach.domain.model.TodoItem

interface TodoRepository {

    suspend fun getTodayTodoItems(): List<TodoItem>
}