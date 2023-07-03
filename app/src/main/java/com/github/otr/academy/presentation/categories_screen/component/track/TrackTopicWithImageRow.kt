package com.github.otr.academy.presentation.categories_screen.component.track

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

/**
 *
 */
@Composable
fun TrackTopicWithImageRow(
    track: Track,
    modifier: Modifier = Modifier
) {

    val title: String = track.title

    Row(
        modifier = modifier.padding(all = DEFAULT_HORIZONTAL_PADDING)
    ) {

        Icon(
            modifier = Modifier.padding(all = DEFAULT_HORIZONTAL_PADDING * 2),
            painter = painterResource(id = R.drawable.jetpack_compose),
            contentDescription = stringResource(
                R.string.categories_screen_track_icon_content_description
            ),
            tint = MaterialTheme.colors.onSecondary
        )

        Text(
            style = MaterialTheme.typography.h2,
            text = title
        )

    }

}
