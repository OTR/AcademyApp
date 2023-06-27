package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.presentation.extensions.firstLineIndentedParagraph
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_TRACK_LONG_DESCRIPTION_HEADER_PADDING_VALUES
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_TRACK_LONG_DESCRIPTION_TEXT_PADDING_VALUES

/**
 *
 */
@Composable
fun TrackScreenTrackLongDescription(
    longDescription: String,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {

        Text(
            modifier = Modifier.padding(TRACK_SCREEN_TRACK_LONG_DESCRIPTION_HEADER_PADDING_VALUES),
            style = MaterialTheme.typography.h2,
            text = stringResource(R.string.track_screen_long_desc_title)
        )

        Text(
            modifier = Modifier.padding(TRACK_SCREEN_TRACK_LONG_DESCRIPTION_TEXT_PADDING_VALUES),
            text = longDescription.firstLineIndentedParagraph()
        )

    }

}
