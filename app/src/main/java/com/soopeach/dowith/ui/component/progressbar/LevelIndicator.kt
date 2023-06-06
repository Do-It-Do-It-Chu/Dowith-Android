package com.soopeach.dowith.ui.component.progressbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.component.VerticalProgressBar
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun LevelIndicator(
    level: Float,
    isPersonal: Boolean = true
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = if (isPersonal) "내 레벨" else "팀 레벨",
            style = DoWithTypography.Body4.copy(DoWithColors.gray800)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Box(
            modifier = Modifier
                .size(51.dp, 38.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(DoWithColors.orange1000),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "${level.toInt()}",
                style = DoWithTypography.Title1.copy(Color.White)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        VerticalProgressBar(progress = level)
    }
}