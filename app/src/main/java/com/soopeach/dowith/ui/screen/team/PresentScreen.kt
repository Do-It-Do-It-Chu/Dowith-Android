package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.soopeach.dowith.R
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import com.soopeach.dowith.utils.shaking

@Composable
fun PresentScreen(
    navController: NavController
) {
    PresentContent(
        onTopBarNavigationIconClicked = {
            navController.popBackStack()
        },
        onStartButtonClicked = {
            // TODO: navigate to CategorySelectScreen
        }
    )
}

@Composable
fun PresentContent(
    onTopBarNavigationIconClicked: () -> Unit = {},
    onStartButtonClicked: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            DoWithTopBar(
                navigationIcon = {
                    Icon(
                        modifier = Modifier.clickable {
                            onTopBarNavigationIconClicked()
                        },
                        imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = "뒤로가기",
                    )
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 20.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "같이 팀 캐릭터를 만들어볼까요?",
                style = DoWithTypography.Title1.copy(DoWithColors.gray800)
            )

            Spacer(modifier = Modifier.height(94.dp))

            Image(
                modifier = Modifier
                    .shaking(),
                painter = painterResource(id = R.drawable.present), contentDescription = "선물 상자 이미지"
            )

            Spacer(modifier = Modifier.height(127.dp))
            
            DoWithButton(text = "시작하기!") {
                onStartButtonClicked()
            }
        }
    }
}