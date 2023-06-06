package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.soopeach.dowith.ui.component.progressbar.LevelIndicator
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
        viewModel.getTodayTodoItem()
    }

    TeamTodoMainContent(state) {
        // Todo: navigate to More Screen
    }
}

@Composable
fun TeamTodoMainContent(
    state: TeamTodoMainState,
    onMoreClicked: () -> Unit = {},
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
        state.todayTodoItem.getDataOrNull()?.let { todoItem ->

            Column(
                modifier = Modifier
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                DoWithTopBar()

                Spacer(modifier = Modifier.height(56.dp))

                Box(
                    Modifier.fillMaxWidth()
                ) {

                    val level =
                        (todoItem.characterLevel.toFloat() / todoItem.characterMaxLevel) * 100
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
                            painter = painterResource(id = DoWithCharacter.Saboten.SABOTEN_FIRST.imageResource),
                            contentDescription = ""
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
                        Text(text = todoItem.recommendTodo,
                        style = DoWithTypography.Body2.copy(DoWithColors.gray900),
                        textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }

}