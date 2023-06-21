package com.github.otr.academy.presentation.main_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.otr.academy.data.database.AppDatabase
import com.github.otr.academy.presentation.AcademyApplication

import com.github.otr.academy.presentation.theme.AcademyAppTheme

/**
 *
 */
class MainActivity : ComponentActivity() {

    private lateinit var appDatabase: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // get our database instance from application
        appDatabase = (application as AcademyApplication).database
        //
        setContent {
            AcademyAppTheme {
                MainScreen()
            }
        }
    }
}
