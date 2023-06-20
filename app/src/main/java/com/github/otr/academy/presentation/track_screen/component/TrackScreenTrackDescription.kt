package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

/**
 *
 */
@Composable
fun TrackScreenTrackDescription(description: String) {
    Text(
        modifier = Modifier.padding(horizontal = DEFAULT_HORIZONTAL_PADDING * 3),
        text = description.firstLineIndentedParagraph()
    )
}
