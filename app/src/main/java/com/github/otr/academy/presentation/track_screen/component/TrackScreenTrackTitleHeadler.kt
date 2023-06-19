package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 *
 */
@Composable
fun TrackScreenTrackTitleHeadler(
    title: String
) {
    Text(
        style = MaterialTheme.typography.h1,
        text = title
    )
}
