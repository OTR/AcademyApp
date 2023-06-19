package com.github.otr.academy.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 *
 */
@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    loginScreenContent: @Composable () -> Unit,
    categoriesScreenContent: @Composable () -> Unit,
    trackScreenContent: @Composable () -> Unit
) {

    NavHost(
        navController = navHostController,
        startDestination = "login_screen"
    ) {
        composable(ScreenState.LoginScreen.route) { loginScreenContent() }
        composable(ScreenState.CategoriesScreen.route) { categoriesScreenContent() }
        composable(ScreenState.TrackScreen.route) { trackScreenContent }

    }

}
