package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 *
 */
@Composable
fun TrackScreenCapstoneProjects(capstoneProjects: List<Project>) {

    Column {
        capstoneProjects.forEach {
            Column {
                Text(text = it.title)
                Text(text = it.description)
            }
            Spacer(modifier = Modifier.padding(vertical = DEFAULT_VERTICAL_PADDING * 2))
        }
    }

}
