package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.presentation.extensions.firstLineIndentedParagraph
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_TRACK_DESCRIPTION_PADDING_VALUES

/**
 *
 */
@Composable
fun TrackScreenTrackDescription(
    description: String,
    modifier: Modifier = Modifier
) {

    Text(
        modifier = modifier.padding(TRACK_SCREEN_TRACK_DESCRIPTION_PADDING_VALUES),
        text = description.firstLineIndentedParagraph()
    )

}
