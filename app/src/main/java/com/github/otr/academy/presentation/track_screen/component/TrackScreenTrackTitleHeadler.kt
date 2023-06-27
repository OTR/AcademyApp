package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.presentation.theme.TRACK_SCREEN_TRACK_TITLE_PADDING_VALUES

/**
 *
 */
@Composable
fun TrackScreenTrackTitleHeader(
    title: String,
    modifier: Modifier = Modifier
) {

    Text(
        modifier = modifier.padding(TRACK_SCREEN_TRACK_TITLE_PADDING_VALUES),
        style = MaterialTheme.typography.h1,
        text = title
    )

}
