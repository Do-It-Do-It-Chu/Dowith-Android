package com.soopeach.domain.usecase

import com.soopeach.domain.model.TodoItem
import com.soopeach.domain.repository.TodoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetTodayTodoItemsUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {

    suspend operator fun invoke(): List<TodoItem> {
        return todoRepository.getTodayTodoItems()
    }
}