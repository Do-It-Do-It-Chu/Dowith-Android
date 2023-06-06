package com.soopeach.dowith.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.soopeach.domain.model.TeamUserData
import com.soopeach.dowith.model.DummyUser
import com.soopeach.dowith.ui.icons.CanNotifyIcon
import com.soopeach.dowith.ui.icons.CantNotifyIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun TeamMemberComposable(
    teamUserData: TeamUserData,
    onNotificationButtonClicked: (Int) -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(DoWithColors.gray100),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.size(32.dp),
                    painter = painterResource(id = DummyUser.getRandomUser().imageResource),
                    contentDescription = "팀원 프로필 이미지",
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = teamUserData.nickname,
                    style = DoWithTypography.Body3.copy(DoWithColors.gray900)
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = if (teamUserData.checked) "완료했어요!" else "열심히 노력중이에요",
                    style = DoWithTypography.Body3.copy(
                        if (teamUserData.checked) DoWithColors.orange1000 else DoWithColors.gray600
                    )
                )

                Image(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .clickable(
                            enabled = teamUserData.checked.not(),
                            onClick = {
                                onNotificationButtonClicked(teamUserData.userId)
                            }
                        ),
                    imageVector = if (teamUserData.checked) CantNotifyIcon else CanNotifyIcon,
                    contentDescription = "알림 보내기 아이콘",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }

}