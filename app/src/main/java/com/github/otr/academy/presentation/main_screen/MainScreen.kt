package com.github.otr.academy.presentation.main_screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.github.otr.academy.presentation.navigation.AppNavGraph
import com.github.otr.academy.presentation.project_screen.ProjectsViewModelFactory
import com.github.otr.academy.presentation.project_screen.ProjectsViewModel

/**
 *
 */
@Composable
fun MainScreen() {

    val navHostController: NavHostController = rememberNavController()
    val projectsViewModel: ProjectsViewModel = viewModel(factory = ProjectsViewModelFactory)

    AppNavGraph(navHostController)

}
