package com.soopeach.dowith.ui.screen

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NamedNavArgument
import com.soopeach.dowith.R
import com.soopeach.dowith.ui.icons.menu.DoneMenu
import com.soopeach.dowith.ui.icons.menu.PersonalTodoMenu
import com.soopeach.dowith.ui.icons.menu.TeamTodoMenu

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int? = null,
    val icon: ImageVector? = null,
    val arguments: List<NamedNavArgument> = emptyList()
) {

    object PersonalTodoMain : Screen("personalTodoMain", R.string.personal_todo, PersonalTodoMenu)
    object TeamTodoMain : Screen("teamTodoMain", R.string.team_todo, TeamTodoMenu)
    object Done : Screen("done", R.string.done, DoneMenu)

    object PersonalTodoMore : Screen("personalTodoMore")

    companion object {
        val bottomNavigationItems = listOf(PersonalTodoMain, TeamTodoMain, Done)
    }
}