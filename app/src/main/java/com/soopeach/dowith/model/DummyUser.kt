package com.soopeach.dowith.model

import androidx.annotation.DrawableRes
import com.soopeach.dowith.R

enum class DummyUser(@DrawableRes val imageResource: Int) {
    FIRST(R.drawable.dummy_user_image_first),
    SECOND(R.drawable.dummy_user_image_second),
    THIRD(R.drawable.dummy_user_image_third);

    companion object {
        fun getRandomUser(): DummyUser {
            return DummyUser.values().toList().shuffled().first()
        }
    }
}