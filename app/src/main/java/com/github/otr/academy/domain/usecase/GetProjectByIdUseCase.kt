package com.github.otr.academy.domain.usecase

import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.domain.repository.ProjectRepository

/**
 *
 */
class GetProjectByIdUseCase(
    private val repository: ProjectRepository
) {

    suspend operator fun invoke(projectId: Int): Project {
        return repository.getProjectById(projectId)
    }

}
