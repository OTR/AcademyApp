package com.github.otr.academy.presentation.main_screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.github.otr.academy.presentation.categories_screen.CategoriesScreen
import com.github.otr.academy.presentation.login_screen.LoginScreen
import com.github.otr.academy.presentation.track_screen.TrackScreen

/**
 *
 */
@Composable
fun MainScreen() {

    val navController: NavController = rememberNavController()

    val viewModel: MainViewModel = viewModel()

    val screenState: State<ScreenState> = viewModel.screenStateFlow.collectAsState()
    val currScreenState: ScreenState = screenState.value

    val onTrackScreenBackPressedListener: () -> Unit = viewModel::setScreenStateToDisplayCategories

    when(currScreenState) {
        ScreenState.Initial -> { Text("Hello world!") }
        ScreenState.DisplayLoginScreen -> { LoginScreen() }
        ScreenState.DisplayCategories -> { CategoriesScreen() }
        is ScreenState.DisplayTrack -> { TrackScreen(onTrackScreenBackPressedListener) }
    }

}
