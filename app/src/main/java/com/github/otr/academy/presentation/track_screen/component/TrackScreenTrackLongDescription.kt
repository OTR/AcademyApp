package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.github.otr.academy.R
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 *
 */
@Composable
fun TrackScreenTrackLongDescription(longDescription: String) {

    println()

    Column() {
        Text(
            modifier = Modifier.padding(
                horizontal = DEFAULT_HORIZONTAL_PADDING * 4,
                vertical = DEFAULT_VERTICAL_PADDING * 2
            ),
            style = MaterialTheme.typography.h2,
            text = stringResource(R.string.track_screen_long_desc_title)
        )
        Text(
            modifier = Modifier.padding(horizontal = DEFAULT_HORIZONTAL_PADDING * 3),
            text = longDescription
        )
    }

}
