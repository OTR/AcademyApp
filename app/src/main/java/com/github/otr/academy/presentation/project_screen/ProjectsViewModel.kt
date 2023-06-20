package com.github.otr.academy.presentation.project_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.github.otr.academy.data.repository.ProjectRepositoryImpl
import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.domain.repository.ProjectRepository
import com.github.otr.academy.domain.usecase.GetProjectByIdUseCase

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 *
 */
class ProjectsViewModel : ViewModel() {

    private val repository: ProjectRepository = ProjectRepositoryImpl()
    private val getProjectByIdUseCase = GetProjectByIdUseCase(repository)

    private val projectsMap: MutableMap<Int, Project> = mutableMapOf()

    private val _projectsListStateFlow: MutableStateFlow<List<Project>> = MutableStateFlow(
        value = emptyList()
    )
    val projectsListStateFlow: StateFlow<List<Project>> = _projectsListStateFlow.asStateFlow()

    private fun loadProjectById(projectId: Int) {
        viewModelScope.launch {
            val project: Project = getProjectByIdUseCase(projectId)
            projectsMap.put(projectId, project)
        }
    }

    fun getProjectsByIds(projectIds: List<Int>) {
        // Check if each project is in projects Map
        projectIds.forEach { projectId: Int ->
            // If not - load Projects By Ids
            if (projectId !in projectsMap.keys) {
                loadProjectById(projectId)
            }
        }
        // If so change State to present project for this track
        val requiredProjects: List<Project> = projectsMap.filterKeys {
            it in projectIds
        }.map { it.value }
        _projectsListStateFlow.value = requiredProjects
    }

}
