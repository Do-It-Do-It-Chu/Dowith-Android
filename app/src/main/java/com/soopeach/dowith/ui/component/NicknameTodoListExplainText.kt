package com.soopeach.dowith.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun NicknameTodoListExplainText(
    isPersonal: Boolean = true,
    nickname: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = nickname,
                style = DoWithTypography.Title2.copy(DoWithColors.orange1000)
            )
            Text(
                text = "님의",
                style = DoWithTypography.Body1.copy(DoWithColors.gray800)
            )
        }
        Text(
            text = if (isPersonal) "개인 투두리스트!" else "팀 투두리스트!",
            style = DoWithTypography.Title1.copy(DoWithColors.gray800)
        )
    }
}