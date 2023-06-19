package com.github.otr.academy.presentation.track_screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.track_screen.component.TrackAppBar
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTopLabelsRow
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackDescription
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackTitleHeadler

/**
 *
 */
@Composable
fun TrackScreen(
    trackId: Int,
    onBackPressedListener: () -> Unit
) {

    val tracksViewModel: TracksViewModel = viewModel(factory = TracksViewModelFactory)
    val track: Track = tracksViewModel.getTrackById(trackId)

    LazyColumn(

    ) {
        item { TrackAppBar(onBackPressedListener) }
        item { TrackScreenTopLabelsRow() }
        item { TrackScreenTrackTitleHeadler(track.title) }
        item { TrackScreenTrackDescription(track.description) }
        item { TrackScreenTrackDescription(track.longDescription) }
    }

}
