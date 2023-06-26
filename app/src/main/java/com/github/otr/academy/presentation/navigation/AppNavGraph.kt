package com.github.otr.academy.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.categories_screen.CategoriesScreen
import com.github.otr.academy.presentation.login_screen.LoginScreen
import com.github.otr.academy.presentation.track_screen.TrackScreen

/**
 *
 */
@Composable
fun AppNavGraph(
    navHostController: NavHostController,
) {

    NavHost(
        navController = navHostController,
        startDestination = Screen.Login.route
    ) {

        composable(Screen.Login.route) {
            LoginScreen( navHostController::navigateToCategoriesScreen )
        }

        composable(Screen.Categories.route) {
            CategoriesScreen { track: Track ->
                navHostController.navigate(Screen.Track.routeWithArgs(track.id))
                }
            }

        composable(Screen.Track.route) {
            it.arguments?.getString(Screen.TRACK_SCREEN_ID_KEY)?.let { key: String ->
                val trackId: Int = key.toInt()
                Log.d("LOG", key) // TODO: remove me
                TrackScreen(trackId) { navHostController.navigateToCategoriesScreen() }
            }
        }

    }

}
