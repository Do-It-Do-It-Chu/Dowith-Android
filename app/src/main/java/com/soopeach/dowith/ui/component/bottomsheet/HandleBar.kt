package com.soopeach.dowith.ui.component.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.theme.DoWithColors

@Composable
fun HandleBar() {
    Box(
        modifier = Modifier
            .size(40.dp, 4.dp)
            .clip(RoundedCornerShape(11.dp))
            .background(color = DoWithColors.gray400)
    )
}