package com.soopeach.dowith

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.soopeach.dowith.ui.AppScreen
import com.soopeach.dowith.ui.theme.DoWithTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, DoWithFcmService::class.java))
        setContent {
            DoWithTheme {
                AppScreen()
            }
        }
    }
}
