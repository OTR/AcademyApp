package com.github.otr.academy.presentation.categories_screen.component.track

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING
import com.github.otr.academy.presentation.theme.getCategoryChipBorder

/**
 *
 */
@Composable
fun TrackCard(
    track: Track,
    onTrackCardClickListener: (Track) -> Unit,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = DEFAULT_HORIZONTAL_PADDING * 2)
            .clickable { onTrackCardClickListener(track) }
        ,
        backgroundColor = MaterialTheme.colors.background,
        border = getCategoryChipBorder(selected = false),
        elevation = 8.dp
    ) {

        Column(
            modifier = Modifier
        ) {
            TrackTopicWithImageRow(track)
            ProjectsCountForTrackRow(track)
            TrackDescriptionRow(track)
//            TrackCompletedTopicsRow() TODO: these UI elements displayed only for logged user
//            TrackAppliedCoreTopicsRow()
        }

    }

}
