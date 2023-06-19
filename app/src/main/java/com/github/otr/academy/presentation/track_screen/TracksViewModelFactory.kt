package com.github.otr.academy.presentation.track_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * TODO: Create and always return a Singleton
 * https://developer.android.com/jetpack/compose/migrate/other-considerations#viewmodel
 * Each Nav Graph destination has its own ViewModelStoreOwner, so when navigating
 * and destination is popped out of BackStack ViewModel is destroyed
 */
object TracksViewModelFactory : ViewModelProvider.Factory {

    private val tracksViewModel: TracksViewModel = TracksViewModel()

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return tracksViewModel as T
    }

}
