package com.soopeach.dowith.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.soopeach.domain.model.TodoItem
import com.soopeach.dowith.ui.icons.DoneIcon
import com.soopeach.dowith.ui.icons.MoreIcon
import com.soopeach.dowith.ui.icons.TodoIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun TodoItemComposable(
    modifier: Modifier = Modifier,
    todoItem: TodoItem,
    isMoreIconVisible: Boolean = false,
    onTodoIconClicked: () -> Unit = {},
    onMoreIconClicked: () -> Unit = {}
) {

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                modifier = Modifier
                    .clickable {
                        onTodoIconClicked()
                    },
                imageVector = if (todoItem.isChecked) TodoIcon else DoneIcon,
                contentDescription = "",
                tint = if (todoItem.isChecked) DoWithColors.orange1000 else DoWithColors.gray400
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = todoItem.content,
                style = DoWithTypography.Body2.copy(DoWithColors.gray700)
            )
        }


        if (isMoreIconVisible) {
            Icon(
                modifier = Modifier
                    .clickable {
                        onMoreIconClicked()
                    },
                imageVector = MoreIcon, contentDescription = "",
                tint = DoWithColors.gray500
            )
        }

    }
}