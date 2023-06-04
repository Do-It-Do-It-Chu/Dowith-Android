package com.soopeach.dowith.model

import androidx.annotation.DrawableRes
import com.soopeach.dowith.R

enum class Category(@DrawableRes val imageResource: Int, val contentDescription: String) {
    RELATIONSHIP(R.drawable.relationship, "대인관계"),
    CHALLENGE(R.drawable.challenge, "도전"),
    EXERCISE(R.drawable.exercise, "운동"),
    MEAL(R.drawable.meal, "식사"),
    SLEEP(R.drawable.sleep, "수면"),
    EMOTION(R.drawable.emotion, "감정"),
}