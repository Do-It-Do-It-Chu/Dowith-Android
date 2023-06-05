package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.soopeach.dowith.model.Category
import com.soopeach.dowith.ui.component.DoWithTopBar
import com.soopeach.dowith.ui.component.TeamTodoCategoryItem
import com.soopeach.dowith.ui.screen.Screen
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import com.soopeach.dowith.utils.bouncingClickable

@Composable
fun CategorySelectScreen(
    navController: NavController,
) {
    CategorySelectContent(
        onTopBarNavigationIconClicked = {
            navController.popBackStack()
        },
        onCategoryItemClicked = {
            // TODO: join Team
            navController.navigate(Screen.MatchingComplete.route)
        }
    )
}

@Composable
fun CategorySelectContent(
    onTopBarNavigationIconClicked: () -> Unit = {},
    onCategoryItemClicked: () -> Unit = {}
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
        }) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues = paddingValues)
                .padding(horizontal = 20.dp)

        ) {

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "원하시는 투두의\n카테고리를 선택해주세요!",
                style = DoWithTypography.Title1.copy(DoWithColors.gray800)
            )

            Spacer(modifier = Modifier.height(30.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(22.dp),
                horizontalArrangement = Arrangement.spacedBy(22.dp),
            ) {

                Category.values().forEach {
                    item {
                        TeamTodoCategoryItem(
                            modifier = Modifier.bouncingClickable {
                                onCategoryItemClicked()
                            },
                            category = it
                        )
                    }
                }
            }
        }
    }
}

