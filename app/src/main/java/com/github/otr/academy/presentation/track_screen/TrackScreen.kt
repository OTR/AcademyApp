package com.github.otr.academy.presentation.track_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.project_screen.ProjectsViewModel
import com.github.otr.academy.presentation.project_screen.ProjectsViewModelFactory
import com.github.otr.academy.presentation.theme.TRACK_SCREEN_LAZY_COLUMN_PADDING_VALUES
import com.github.otr.academy.presentation.track_screen.component.TrackScreenAppBar
import com.github.otr.academy.presentation.track_screen.component.TrackScreenCapstoneProjects
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTopLabelsRow
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackDescription
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackLongDescription
import com.github.otr.academy.presentation.track_screen.component.TrackScreenTrackTitleHeader

/**
 *
 */
@Composable
fun TrackScreen(
    trackId: Int,
    modifier: Modifier = Modifier,
    onBackPressedListener: () -> Unit
) {

    val tracksViewModel: TracksViewModel = viewModel(factory = TracksViewModelFactory)
    val projectsViewModel: ProjectsViewModel = viewModel(factory = ProjectsViewModelFactory)
    val track: Track = tracksViewModel.getTrackById(trackId)
    // load required projects
    projectsViewModel.getProjectsByIds(track.getAllProjectIds())

    val projectsState: State<List<Project>> = projectsViewModel.projectsListStateFlow.collectAsState()
    val capstoneProjects: List<Project> = projectsState.value.filter { it.id in track.capstoneProjects }

    val modifier = modifier.padding(TRACK_SCREEN_LAZY_COLUMN_PADDING_VALUES)

    LazyColumn(

    ) {

        item { TrackScreenAppBar(onBackPressedListener, modifier = modifier) }
        item { TrackScreenTopLabelsRow() }
        item { TrackScreenTrackTitleHeader(track.title) }
        item { TrackScreenTrackDescription(track.description) }
        item { TrackScreenTrackLongDescription(track.longDescription) }
        item { TrackScreenCapstoneProjects(capstoneProjects) }

    }

}
