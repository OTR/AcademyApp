package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable

/**
 *
 */
@Composable
fun TrackAppBar(
    onBackPressedListener: () -> Unit
) {

    TopAppBar() {
        IconButton(onClick = { onBackPressedListener() } ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Go on back screen Icon Button"
            )

        }
        Text(text = "Back To Selecting Track")
    }

}
