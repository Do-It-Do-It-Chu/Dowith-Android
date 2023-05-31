package com.soopeach.dowith.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.soopeach.domain.model.TodoItem
import com.soopeach.dowith.ui.icons.CheckBoxIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun SimplifiedTodoContainer(
    todoItems: List<TodoItem>,
    onTodoIconClicked: (Long) -> Unit = {},
    onMoreIconClicked: () -> Unit = {}
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(156.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(DoWithColors.gray100)
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Row {
                    Icon(
                        imageVector = CheckBoxIcon,
                        contentDescription = "체크 박스 아이콘",
                        tint = DoWithColors.orange1000
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "오늘의 할 일을 달성해주세요!",
                        style = DoWithTypography.Body3.copy(DoWithColors.gray800)
                    )
                }

                Row(
                    modifier = Modifier.clickable {
                        onMoreIconClicked()
                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "TO DO",
                        style = DoWithTypography.Body3.copy(DoWithColors.gray500)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Icon(
                        imageVector = Icons.Filled.ArrowForwardIos,
                        contentDescription = "To Do 작성하러 가기 아이콘",
                        modifier = Modifier.size(16.dp),
                        tint = DoWithColors.gray500
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            todoItems.forEach {
                TodoItemComposable(
                    todoItem = it,
                    modifier = Modifier.fillMaxWidth(),
                    isMoreIconVisible = false,
                    onTodoIconClicked = {
                        onTodoIconClicked(it.id)
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))
            }
        }

    }
}