package com.soopeach.dowith.model

import androidx.annotation.DrawableRes
import com.soopeach.dowith.R

sealed class DoWithCharacter{

    enum class Bell(@DrawableRes val imageResource: Int) {
        BELL_FIRST(R.drawable.bell_first),
        BELL_SECOND(R.drawable.bell_second),
        BELL_THIRD(R.drawable.bell_third),
    }

    enum class Saboten(@DrawableRes val imageResource: Int) {
        SABOTEN_FIRST(R.drawable.saboten_first),
        SABOTEN_SECOND(R.drawable.saboten_second),
        SABOTEN_THIRD(R.drawable.saboten_third),
    }

}
