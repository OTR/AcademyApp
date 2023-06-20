package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.otr.academy.presentation.categories_screen.component.category.CategoryChip
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

/**
 *
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TrackScreenTopLabelsRow() {
    Row {
        Chip(
            onClick = {},
            enabled = false,
        ) {
            Text(
                text = "Track"
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = DEFAULT_HORIZONTAL_PADDING))
        Chip(
            onClick = { /*TODO*/ },
            enabled = false,
            colors = ChipDefaults.chipColors(
                disabledContentColor = MaterialTheme.colors.onSecondary,
                disabledBackgroundColor = MaterialTheme.colors.secondary
            )
        ) {
            Text("Beta")
        }
    }
}
