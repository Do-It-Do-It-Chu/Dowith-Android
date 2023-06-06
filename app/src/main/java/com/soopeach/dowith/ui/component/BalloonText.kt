package com.soopeach.dowith.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.R
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun BalloonText(
    text: String
) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.balloon),
            contentDescription = "말풍선 이미지"
        )
        Text(
            modifier = Modifier.padding(bottom = 13.dp),
            text = text,
            textAlign = TextAlign.Center,
            style = DoWithTypography.Body4.copy(color = DoWithColors.gray700)
        )
    }
}