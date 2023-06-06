package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.NicknameTodoListExplainText
import com.soopeach.dowith.ui.component.TeamMemberComposable
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import com.soopeach.dowith.viewmodel.team.TeamTodoMoreState
import com.soopeach.dowith.viewmodel.team.TeamTodoMoreViewModel
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun TeamTodoMoreScreen(
    navController: NavController
) {
    val viewModel = hiltViewModel<TeamTodoMoreViewModel>()
    val state by viewModel.collectAsState()

    LaunchedEffect(true) {
        viewModel.getTeamTodoData()
    }
    TeamTodoMoreContent(state)
}

@Composable
fun TeamTodoMoreContent(
    state: TeamTodoMoreState,
    onTopBarNavigationIconClicked: () -> Unit = {},
    onCompleteButtonClicked: () -> Unit = {},
    onNotifyIconClicked: (Int) -> Unit = {},
) {

    Column(
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {

        DoWithTopBar(
            navigationIcon = {
                Icon(
                    modifier = Modifier.clickable {
                        onTopBarNavigationIconClicked()
                    },
                    imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = "뒤로가기",
                )
            },
            isMenusVisible = false,
        )

        Spacer(modifier = Modifier.height(10.dp))

        // TODO: User name
        NicknameTodoListExplainText(false, nickname = "두잇츄")

        Spacer(modifier = Modifier.height(18.dp))

        state.teamTodoItem.getDataOrNull()?.let { teamTodoItem ->
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(DoWithColors.gray100)
                    .padding(20.dp),
            ) {

                Text("오늘의 할 일!", style = DoWithTypography.Title3.copy(DoWithColors.gray800))
                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = teamTodoItem.recommendTodo,
                    style = DoWithTypography.Body2.copy(DoWithColors.gray900)
                )
                Spacer(modifier = Modifier.height(30.dp))

                DoWithButton(text = "완료하기") {
                    onCompleteButtonClicked()
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Text(text = "팀원을 확인해주세요!", style = DoWithTypography.Body2.copy(DoWithColors.gray700))

            Spacer(modifier = Modifier.height(10.dp))

            teamTodoItem.teamUserDataList.forEach { userData ->
                TeamMemberComposable(userData) {
                    onNotifyIconClicked(it)
                }
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }

}
