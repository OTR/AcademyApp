package com.github.otr.academy.presentation.track_screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.main_screen.MainViewModel
import com.github.otr.academy.presentation.navigation.ScreenState
import com.github.otr.academy.presentation.track_screen.component.TrackAppBar
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTopLabelsRow
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackDescription
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackTitleHeadler

/**
 *
 */
@Composable
fun TrackScreen(
    navHostController: NavHostController
) {


//    LazyColumn() {
//        item { TrackAppBar(onBackPressedListener) }
//        item { TrackScreenTopLabelsRow() }
//        item { TrackScreenTrackTitleHeadler(track.title) }
//        item { TrackScreenTrackDescription(track.description) }
//        item { TrackScreenTrackDescription(track.longDescription) }
//    }

}
