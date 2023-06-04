package com.soopeach.dowith.ui.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.soopeach.dowith.model.Category

@Composable
fun TeamTodoCategoryItem(
    modifier: Modifier,
    category: Category
) {
    Image(
        modifier = modifier,
        painter = painterResource(id = category.imageResource),
        contentDescription = category.contentDescription + " 카테고리"
    )
}