package com.github.otr.academy.presentation.main_screen

import androidx.lifecycle.ViewModel
import com.github.otr.academy.domain.entitiy.Track
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 *
 */
class MainViewModel : ViewModel() {

    private val _screenStateFlow: MutableStateFlow<ScreenState> = MutableStateFlow(
        value = ScreenState.DisplayCategories
    )
    val screenStateFlow: StateFlow<ScreenState> = _screenStateFlow.asStateFlow()

    fun setScreenStateToDisplayTrack(track: Track) {
        _screenStateFlow.value = ScreenState.DisplayTrack(track = track)
    }

    fun setScreenStateToDisplayCategories() {
        _screenStateFlow.value = ScreenState.DisplayCategories
    }

}
