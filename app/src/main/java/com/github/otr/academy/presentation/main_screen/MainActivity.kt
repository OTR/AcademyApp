package com.github.otr.academy.presentation.main_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.github.otr.academy.ui.theme.AcademyAppTheme

/**
 *
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcademyAppTheme {
                MainScreen()
            }
        }
    }
}
