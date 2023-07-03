package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_SPACER_BETWEEN_LABELS_WIDTH

/**
 *
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TrackScreenTopLabelsRow(
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
    ) {

        Chip(
            onClick = {},
            enabled = false,
        ) {

            Text(
                text = stringResource(R.string.track_screen_top_label_track_text)
            )

        }

        Spacer(modifier = Modifier.width(TRACK_SCREEN_SPACER_BETWEEN_LABELS_WIDTH))

        Chip(
            onClick = { /*TODO*/ },
            enabled = false,
            colors = ChipDefaults.chipColors(
                disabledContentColor = MaterialTheme.colors.onSecondary,
                disabledBackgroundColor = MaterialTheme.colors.secondary
            )
        ) {

            Text(
                text = stringResource(R.string.track_screen_top_label_beta_text)
            )

        }

    }

}
