package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 *
 */
@Composable
fun TrackScreenTopLabelsRow() {
    Row {
        IconButton(
            onClick = { /*TODO*/ },
            enabled = false,
        ) {
            Text("Track")
        }
        IconButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("Beta")
        }
    }
}
