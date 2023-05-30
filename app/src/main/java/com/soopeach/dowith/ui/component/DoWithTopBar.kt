package com.soopeach.dowith.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.icons.Logo
import com.soopeach.dowith.ui.icons.topbar.MyPageIcon
import com.soopeach.dowith.ui.icons.topbar.NotificationIcon
import com.soopeach.dowith.ui.theme.DoWithColors

@Composable
fun DoWithTopBar(
    navigationIcon: @Composable (() -> Unit)? = null,
    onNotificationClicked: () -> Unit = {},
    onMyPageClicked: () -> Unit = {}
) {
    TopAppBar(
        backgroundColor = Color.White,
        modifier = Modifier
            .height(60.dp),
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            navigationIcon?.invoke() ?: run {
                Image(
                    modifier = Modifier.size(60.dp, 23.dp),
                    contentScale = ContentScale.Crop,
                    imageVector = Logo,
                    contentDescription = "두윗 로고"
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(shape = CircleShape)
                        .clickable {
                            onNotificationClicked()
                        },
                    imageVector = NotificationIcon,
                    contentDescription = "알림 아이콘",
                    tint = DoWithColors.gray500
                )

                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(shape = CircleShape)
                        .clickable {
                            onMyPageClicked()
                        },
                    imageVector = MyPageIcon,
                    contentDescription = "마이 페이지 아이콘",
                    tint = DoWithColors.gray500
                )
            }

        }
    }
}