package com.soopeach.dowith.ui.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun DoWithButton(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color = DoWithColors.gray800,
    onButtonClicked: () -> Unit = {}
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = { onButtonClicked() },
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
    ) {
        Text(
            text = text,
            style = DoWithTypography.Body3.copy(Color.White)
        )
    }
}