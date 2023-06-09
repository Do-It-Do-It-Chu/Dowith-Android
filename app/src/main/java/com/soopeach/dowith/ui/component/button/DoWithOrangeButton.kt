package com.soopeach.dowith.ui.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun DoWithOrangeButton(
    modifier: Modifier = Modifier,
    text: String,
    onButtonClicked: () -> Unit = {}
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = { onButtonClicked() },
        colors = ButtonDefaults.buttonColors(backgroundColor = DoWithColors.orange200),
    ) {
        Text(
            text = text,
            style = DoWithTypography.Body3.copy(DoWithColors.orange1000)
        )
    }
}