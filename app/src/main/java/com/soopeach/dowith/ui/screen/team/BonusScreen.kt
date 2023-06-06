package com.soopeach.dowith.ui.screen.team

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.soopeach.dowith.R
import com.soopeach.dowith.ui.component.button.DoWithButton
import com.soopeach.dowith.ui.icons.DoneIcon
import com.soopeach.dowith.ui.theme.DoWithColors
import com.soopeach.dowith.ui.theme.DoWithTypography

@Composable
fun BonusScreen(
    navController: NavController
) {
    BonusContent {
        navController.popBackStack()
    }

}

@Composable
fun BonusContent(
    onButtonClicked: () -> Unit = {}
) {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.fire_cracker))
    val progress by animateLottieCompositionAsState(composition)

    Box(
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .offset( y = (-40).dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                modifier = Modifier.size(54.dp),
                imageVector = DoneIcon, contentDescription = "완료 아이콘",
                tint = DoWithColors.orange1000
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "모든 팀원이\n오늘의 투두를 달성했어요!",
                style = DoWithTypography.Body2.copy(DoWithColors.gray900),
                textAlign = TextAlign.Center
            )
        }

        DoWithButton(
            modifier = Modifier.padding(horizontal = 20.dp)
                .offset(y = (-40).dp),
            text = "보너스 받기") {
            onButtonClicked()
        }

    }

    LottieAnimation(
        modifier = Modifier.fillMaxSize(),
        composition = composition,
        progress = { progress },
        contentScale = ContentScale.FillHeight
    )

}