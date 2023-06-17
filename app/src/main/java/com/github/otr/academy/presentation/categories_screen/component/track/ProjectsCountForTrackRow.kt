package com.github.otr.academy.presentation.categories_screen.component.track

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

import kotlin.math.roundToInt

/**
 *
 */
@Composable
fun ProjectsCountForTrackRow(track: Track) {

    val projects: Int = track.projects.size
    val secondsToComplete: Double = track.secondsToComplete
    val hoursToComplete: Int = (secondsToComplete / 60.0 / 60.0).roundToInt()

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Row() {
            Icon(
                modifier = Modifier.padding(end = DEFAULT_HORIZONTAL_PADDING),
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "",
                tint = MaterialTheme.colors.primaryVariant,
            )
            Text(
                color = MaterialTheme.colors.primaryVariant,
                text = "$projects projects",
                style = MaterialTheme.typography.body2
            )
        }
        Spacer(
            modifier = Modifier.padding(DEFAULT_HORIZONTAL_PADDING)
        )
        Row() {
            Icon(
                modifier = Modifier.padding(end = DEFAULT_HORIZONTAL_PADDING),
                imageVector = Icons.Outlined.DateRange,
                contentDescription = "Date Range Icon",
                tint = MaterialTheme.colors.primaryVariant,
            )
            Text(
                color = MaterialTheme.colors.primaryVariant,
                text = "$hoursToComplete hours",
                style = MaterialTheme.typography.body2
            )
        }

    }

}
