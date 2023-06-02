package com.soopeach.dowith.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.icons.TodoIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun WillBeRegisteredTodo(
    content: String
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Icon(
            TodoIcon,
            contentDescription = "Todo 아이콘", tint = DoWithColors.gray400
        )

        Text(
            text = content,
            style = DoWithTypography.Body2.copy(DoWithColors.gray700),
        )
    }
}