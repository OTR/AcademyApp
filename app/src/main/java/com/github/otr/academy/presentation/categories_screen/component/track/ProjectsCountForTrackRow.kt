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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING

import kotlin.math.roundToInt

private const val SECONDS_IN_HOUR: Int = 3600

/**
 *
 */
@Composable
fun ProjectsCountForTrackRow(
    track: Track,
    modifier: Modifier = Modifier
) {

    val projects: Int = track.projects.size
    val secondsToComplete: Double = track.secondsToComplete
    val hoursToComplete: Int = (secondsToComplete / SECONDS_IN_HOUR).roundToInt()

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier
        ) {
            Icon(
                modifier = Modifier.padding(end = DEFAULT_HORIZONTAL_PADDING),
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = stringResource(
                    R.string.categories_screen_projects_count_icon_content_description
                ),
                tint = MaterialTheme.colors.primaryVariant,
            )
            Text(
                color = MaterialTheme.colors.primaryVariant,
                text = "$projects " + stringResource(
                    R.string.categories_screen_projects_count_text_postfix
                ),
                style = MaterialTheme.typography.body2
            )
        }
        Spacer(
            modifier = Modifier.padding(DEFAULT_HORIZONTAL_PADDING)
        )
        Row(
            modifier = Modifier
        ) {
            Icon(
                modifier = Modifier.padding(end = DEFAULT_HORIZONTAL_PADDING),
                imageVector = Icons.Outlined.DateRange,
                contentDescription = stringResource(
                    R.string.categories_screen_projects_count_date_icon_content_description
                ),
                tint = MaterialTheme.colors.primaryVariant,
            )
            Text(
                color = MaterialTheme.colors.primaryVariant,
                text = "$hoursToComplete " + stringResource(
                    R.string.categories_screen_projects_count_take_hours_postfix
                ),
                style = MaterialTheme.typography.body2
            )
        }

    }

}
