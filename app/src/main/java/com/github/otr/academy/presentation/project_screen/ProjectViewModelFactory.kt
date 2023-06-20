package com.github.otr.academy.presentation.project_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *
 */
object ProjectViewModelFactory : ViewModelProvider.Factory {

    private val projectViewModel: ProjectViewModel = ProjectViewModel()

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return projectViewModel as T
    }

}
