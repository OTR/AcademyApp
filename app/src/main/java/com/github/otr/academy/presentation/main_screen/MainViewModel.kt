package com.github.otr.academy.presentation.main_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 *
 */
class MainViewModel : ViewModel() {

    private val _screenStateFlow: MutableStateFlow<ScreenState> = MutableStateFlow(
        value = ScreenState.Initial
    )
    val screenStateFlow: StateFlow<ScreenState> = _screenStateFlow.asStateFlow()

}
