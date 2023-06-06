package com.soopeach.dowith.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.theme.DoWithColors

@Composable
fun VerticalProgressBar(
    progress: Float
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
    ) {

        Box(
            modifier = Modifier
                .width(8.dp)
                .height(332.dp)
                .clip(RoundedCornerShape(33.dp))
                .background(DoWithColors.gray500.copy(alpha = .3f))
        )

        val progressHeight = 332 * progress / 100

        Box(
            modifier = Modifier
                .width(8.dp)
                .height(progressHeight.dp)
                .clip(RoundedCornerShape(33.dp))
                .background(DoWithColors.orange1000)
        )
    }
}