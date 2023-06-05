package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.icons.DoneIcon
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun MatchingCompleteScreen(
    navController: NavController
) {
    MatchingCompleteContent(
        onTopBarNavigationIconClicked = {
            navController.popBackStack()
        },
        onButtonClicked = {
            navController.popBackStack(Screen.TeamTodoMain.route, false)
        }
    )
}

@Composable
fun MatchingCompleteContent(
    onTopBarNavigationIconClicked: () -> Unit = {},
    onButtonClicked: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            DoWithTopBar(
                modifier = Modifier.padding(horizontal = 20.dp),
                navigationIcon = {
                    Icon(
                        modifier = Modifier.clickable {
                            onTopBarNavigationIconClicked()
                        },
                        imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = "뒤로가기",
                    )
                },
                isMenusVisible = false
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(paddingValues)
                .padding(horizontal = 20.dp)
                .padding(bottom = 40.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(48.dp))

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier.size(54.dp),
                    imageVector = DoneIcon, contentDescription = "완료 아이콘",
                    tint = DoWithColors.orange1000
                )

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "팀 매칭을 완료했어요!",
                    style = DoWithTypography.Title1.copy(DoWithColors.gray800),
                )
            }

            DoWithButton(text = "확인") {
                onButtonClicked()
            }
        }
    }
}