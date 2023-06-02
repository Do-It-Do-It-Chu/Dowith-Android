package com.soopeach.domain.usecase

import com.soopeach.domain.repository.TodoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostTodoUseCase @Inject constructor(
    private val todoRepository: TodoRepository
){

    suspend operator fun invoke(content: String) = todoRepository.postTodoItem(content)
}