package com.github.otr.academy.data.repository

import com.github.otr.academy.data.dto.project.ProjectContainerDTO
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.domain.repository.ProjectRepository
import retrofit2.http.Body

/**
 *
 */
class ProjectRepositoryImpl : ProjectRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getProjectById(projectId: Int): Project {
        apiClient.getProjectById(projectId).let { response ->
            val body: ProjectContainerDTO? = response.body()
            if (response.isSuccessful && body != null) {
                return body.projects.first { it.id == projectId }.mapToProject()
            } else {
                throw RuntimeException("Response code 200 or couldn't parse JSON")
            }
        }
    }

}
