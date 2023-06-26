package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.data.converter.HtmlConverter
import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.presentation.extensions.firstLineIndentedParagraph
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_SPACER_AFTER_CAPSTONE_PROJECTS_HEADER_HEIGHT
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_SPACER_AFTER_CAPSTONE_PROJECTS_TEXT_HEIGHT

/**
 *
 */
@Composable
fun TrackScreenCapstoneProjects(
    capstoneProjects: List<Project>,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {

        Text(
            style = MaterialTheme.typography.h2,
            text = stringResource(R.string.track_screen_capstone_projects_title)
        )

        Text(
            style = MaterialTheme.typography.h3,
            text = stringResource(R.string.track_screen_capstone_projects_sub_title)
        )

        Spacer(
            modifier = Modifier.height(TRACK_SCREEN_SPACER_AFTER_CAPSTONE_PROJECTS_HEADER_HEIGHT)
        )

        capstoneProjects.forEach {
            val description: String = HtmlConverter.dummyConvertToText(it.description)

            Column {

                Text(
                    style = MaterialTheme.typography.h4,
                    text = it.title
                )

                Text(
                    text = description.firstLineIndentedParagraph()
                )

            }

            Spacer(
                modifier = Modifier.height(TRACK_SCREEN_SPACER_AFTER_CAPSTONE_PROJECTS_TEXT_HEIGHT)
            )

        }
    }

}
