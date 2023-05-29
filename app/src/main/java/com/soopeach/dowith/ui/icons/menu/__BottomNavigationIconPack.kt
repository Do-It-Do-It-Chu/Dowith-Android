package com.soopeach.dowith.ui.icons.menu

import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

object BottomNavigationIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

val BottomNavigationIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons = listOf(DoneMenu, PersonalTodoMenu, TeamTodoMenu)
    return __AllIcons!!
  }
