package com.soopeach.dowith.ui.component.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Text
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.soopeach.dowith.ui.icons.EraserIcon
import com.soopeach.dowith.ui.icons.TrashCanIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography
import kotlinx.coroutines.CoroutineScope

sealed interface TodoContainerModalBottomSheetType {
    object Write : TodoContainerModalBottomSheetType
    object More : TodoContainerModalBottomSheetType
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TodoContainerModalBottomSheetLayout(
    bottomSheetType: TodoContainerModalBottomSheetType = TodoContainerModalBottomSheetType.More,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    modalSheetState: ModalBottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded },
        skipHalfExpanded = false
    ),
    onModifyButtonClicked: () -> Unit = {},
    onDeleteButtonClicked: () -> Unit = {},
    content: @Composable () -> Unit = {

    },
) {
    ModalBottomSheetLayout(
        sheetState = modalSheetState,
        sheetShape = RoundedCornerShape(12.dp, 12.dp, 0.dp, 0.dp),
        sheetContent = {

            when (bottomSheetType) {
                TodoContainerModalBottomSheetType.Write -> {

                }

                TodoContainerModalBottomSheetType.More -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Spacer(modifier = Modifier.height(10.dp))

                        Box(
                            modifier = Modifier
                                .size(40.dp, 4.dp)
                                .clip(RoundedCornerShape(11.dp))
                                .background(color = DoWithColors.gray400)
                        )

                        Spacer(modifier = Modifier.height(34.dp))

                        TextButtonWithLeftIcon(
                            text = "수정하기",
                            onButtonClicked = { onModifyButtonClicked() }) {
                            Icon(
                                EraserIcon, contentDescription = "수정하기 아이콘",
                                tint = DoWithColors.gray700
                            )
                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        TextButtonWithLeftIcon(
                            text = "삭제하기",
                            onButtonClicked = { onDeleteButtonClicked() }) {
                            Icon(
                                TrashCanIcon, contentDescription = "삭제하기 아이콘",
                                tint = DoWithColors.gray700
                            )
                        }

                        Spacer(modifier = Modifier.height(52.dp))

                    }
                }
            }
        }
    ) {
        content()
    }
}

@Composable
fun TextButtonWithLeftIcon(
    text: String,
    onButtonClicked: () -> Unit,
    icon: @Composable () -> Unit
) {
    Row(
        modifier = Modifier.clickable {
            onButtonClicked()
        },
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        icon()
        Text(
            text = text,
            style = DoWithTypography.Body2.copy(DoWithColors.gray700)
        )
    }
}