package com.soopeach.data.datasource

import com.soopeach.domain.model.TodoItem

interface TodoDataSource {

    suspend fun getTodayTodoItems(): List<TodoItem>
}