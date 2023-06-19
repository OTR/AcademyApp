package com.github.otr.academy.presentation.main_screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.github.otr.academy.presentation.categories_screen.CategoriesScreen
import com.github.otr.academy.presentation.login_screen.LoginScreen
import com.github.otr.academy.presentation.navigation.AppNavGraph
import com.github.otr.academy.presentation.navigation.ScreenState
import com.github.otr.academy.presentation.track_screen.TrackScreen

/**
 *
 */
@Composable
fun MainScreen() {

    val navHostController: NavHostController = rememberNavController()

    AppNavGraph(
        navHostController = navHostController,
        loginScreenContent = { LoginScreen(navHostController) } ,
        categoriesScreenContent = { CategoriesScreen(navHostController) },
        trackScreenContent = { TrackScreen(navHostController) }
    )

}
