package com.github.otr.academy.presentation.categories_screen.component.track

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

/**
 *
 */
@Composable
fun TrackTopicWithImageRow(track: Track) {

    val title: String = track.title

    Row(
        modifier = Modifier.padding(all = DEFAULT_HORIZONTAL_PADDING)
    ) {
        Icon(
            modifier = Modifier.padding(all = DEFAULT_HORIZONTAL_PADDING * 2),
            imageVector = Icons.Outlined.CheckCircle,
            contentDescription = "Image for a learning track",
            tint = MaterialTheme.colors.onSecondary
        )
        Text(
            style = MaterialTheme.typography.h2,
            text = title
        )
    }

}
