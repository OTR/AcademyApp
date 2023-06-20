package com.github.otr.academy.presentation.project_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *
 */
object ProjectsViewModelFactory : ViewModelProvider.Factory {

    private val projectViewModel: ProjectsViewModel = ProjectsViewModel()

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return projectViewModel as T
    }

}
