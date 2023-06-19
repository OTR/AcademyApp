package com.github.otr.academy.presentation.main_screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

import com.github.otr.academy.presentation.categories_screen.CategoriesScreen

/**
 *
 */
@Composable
fun MainScreen() {

    val viewModel: MainViewModel = viewModel()

    val screenState: State<ScreenState> = viewModel.screenStateFlow.collectAsState()
    val currScreenState: ScreenState = screenState.value

    when(currScreenState) {
        ScreenState.Initial -> { Text("Hello world!") }
        ScreenState.DisplayCategories -> { CategoriesScreen() }
    }

}
