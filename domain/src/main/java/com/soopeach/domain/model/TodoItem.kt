package com.soopeach.domain.model

data class TodoItem(
    val id: Long,
    val content: String,
    val deadline: String,
    val isChecked: Boolean
) {

    companion object {

        private val dummyTodoList = listOf(
            "물 2L 마시기",
            "애플워치 충전하기",
            "코틀린 공부하기",
            "안드로이드 공부하기",
            "두윗 하기",
            "과제 하기",
            "오늘 하루의 감정을 담은 일기 쓰기"
        )

        val DUMMY
            get() = TodoItem(
                (0..1000L).shuffled().first(),
                dummyTodoList.shuffled().first(),
                "2023-05-30T10:04:22.139Z",
                listOf(true, false).shuffled().first()
            )

        const val NOT_SELECTED = -1L
    }
}