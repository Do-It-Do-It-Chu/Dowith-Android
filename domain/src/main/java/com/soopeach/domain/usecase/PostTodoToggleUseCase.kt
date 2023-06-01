package com.soopeach.domain.usecase

import com.soopeach.domain.model.TodoItem
import com.soopeach.domain.repository.TodoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostTodoToggleUseCase @Inject constructor(
    private val todoRepository: TodoRepository
) {

    suspend operator fun invoke(id: Long): TodoItem {
        return todoRepository.postTodoToggle(id)
    }
}