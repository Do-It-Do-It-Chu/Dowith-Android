package com.soopeach.dowith.ui.screen

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NamedNavArgument
import com.soopeach.dowith.R

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int? = null,
    val icon: ImageVector? = null,
    val arguments: List<NamedNavArgument> = emptyList()
) {

    object PersonalTodo : Screen("personalTodo", R.string.personal_todo, Icons.Rounded.Person)
    object TeamTodo : Screen("teamTodo", R.string.team_todo, Icons.Rounded.Groups)
    object Done : Screen("done", R.string.done, Icons.Rounded.Done)

    companion object {
        val bottomNavigationItems = listOf(PersonalTodo, TeamTodo, Done)
    }
}