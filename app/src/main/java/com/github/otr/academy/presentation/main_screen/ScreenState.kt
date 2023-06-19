package com.github.otr.academy.presentation.main_screen

import com.github.otr.academy.domain.entitiy.Track

/**
 *
 */
sealed class ScreenState {

    object Initial : ScreenState()

    object DisplayLoginScreen: ScreenState()

    object DisplayCategories : ScreenState()

    class DisplayTrack(val track: Track) : ScreenState()

}
