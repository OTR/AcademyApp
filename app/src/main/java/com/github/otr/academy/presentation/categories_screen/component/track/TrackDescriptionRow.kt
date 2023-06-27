package com.github.otr.academy.presentation.categories_screen.component.track

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

/**
 *
 */
@Composable
fun TrackDescriptionRow(
    track: Track,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(all = DEFAULT_HORIZONTAL_PADDING * 2),
        textAlign = TextAlign.Justify,
        text = track.description,
        style = MaterialTheme.typography.body1
    )
}
