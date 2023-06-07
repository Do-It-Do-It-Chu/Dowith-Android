package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.soopeach.dowith.R
import com.soopeach.dowith.model.DoWithCharacter
import com.soopeach.dowith.ui.component.BalloonText
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.SimplifiedTodoContainer
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.component.progressbar.LevelIndicator
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import com.soopeach.dowith.viewmodel.team.TeamTodoMainState
import com.soopeach.dowith.viewmodel.team.TeamTodoMainViewModel
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun TeamTodoMainScreen(
    navController: NavController
) {

    val viewModel = hiltViewModel<TeamTodoMainViewModel>()
    val state by viewModel.collectAsState()

    LaunchedEffect(true) {
        if (state.hasTeam) {
            viewModel.getMyTeamInfoList()
        }
    }

    TeamTodoMainContent(state,
        onMoreClicked = {
            navController.navigate(Screen.TeamTodoMore.route)
        },
        onTodoStartButtonClicked = {
            navController.navigate(Screen.Present.route)
            viewModel.joinTeam()
        })
}

@Composable
fun TeamTodoMainContent(
    state: TeamTodoMainState,
    onMoreClicked: () -> Unit = {},
    onTodoStartButtonClicked: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background), contentDescription = "배경",
            contentScale = ContentScale.Crop
        )

        // for test
        if (state.hasTeam) {
            // TODO: Pager
            state.myTeamInfoList.getDataOrNull()?.teamInfoList?.first().let { teamInfo ->

                teamInfo?.let {
                    Column(
                        modifier = Modifier
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        DoWithTopBar()

                        Spacer(modifier = Modifier.height(10.dp))

                        Box(
                            Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.BottomStart
                        ) {

                            val level =
                                (it.characterLevel.toFloat() / it.characterMaxLevel) * 100
                            LevelIndicator(level, false)

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                BalloonText("안녕하세요 반가워요.")

                                Spacer(modifier = Modifier.height(14.dp))

                                // TODO: Character
                                Image(
                                    painter = painterResource(id = DoWithCharacter.Saboten.SABOTEN_THIRD.imageResource),
                                    contentDescription = "캐릭터 이미지"
                                )

                            }
                        }

                        Spacer(modifier = Modifier.height(54.dp))

                        SimplifiedTodoContainer(
                            onMoreClicked = onMoreClicked
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = it.recommendTodo,
                                    style = DoWithTypography.Body2.copy(DoWithColors.gray900),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                } ?: run {
                    // TODO: join team
                }
            }
        } else {
            Column(
                modifier = Modifier
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                DoWithTopBar()

                Spacer(modifier = Modifier.height(48.dp))

                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(367.dp)
                        .padding(horizontal = 20.dp)
                        .background(
                            Color.White.copy(.4f),
                            RoundedCornerShape(12.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(28.dp),
                        imageVector = Icons.Filled.Add,
                        contentDescription = "더하기 버튼",
                        tint = DoWithColors.orange1000
                    )
                }

                Spacer(modifier = Modifier.height(49.dp))

                Box(
                    modifier = Modifier
                        .height(156.dp)
                        .background(
                            Color.White,
                            RoundedCornerShape(12.dp)
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(vertical = 32.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "반가워요! 팀 투두를 만들어주세요",
                            style = DoWithTypography.Body2.copy(DoWithColors.gray900),
                        )

                        DoWithButton(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            text = "팀 투두 시작하기"
                        ) {
                            onTodoStartButtonClicked()
                        }
                    }
                }
            }
        }

    }
}