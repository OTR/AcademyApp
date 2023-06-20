package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 *
 */
@Composable
fun TrackScreenTrackTitleHeader(
    title: String
) {
    Text(
        modifier = Modifier.padding(
            start = DEFAULT_HORIZONTAL_PADDING * 3,
            bottom = DEFAULT_VERTICAL_PADDING * 2
        ),
        style = MaterialTheme.typography.h1,
        text = title
    )
}
