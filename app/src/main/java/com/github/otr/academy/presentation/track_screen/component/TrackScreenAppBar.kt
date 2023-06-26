package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R

/**
 *
 */
@Composable
fun TrackScreenAppBar(
    onBackPressedListener: () -> Unit,
    modifier: Modifier = Modifier
) {

    TopAppBar(
        modifier = modifier
    ) {

        IconButton(
            onClick = { onBackPressedListener() }
        ) {

            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = stringResource(
                    R.string.track_screen_app_bar_icon_content_description
                )
            )

        }

        Text(
            text = stringResource(R.string.track_screen_app_bar_text)
        )

    }

}
