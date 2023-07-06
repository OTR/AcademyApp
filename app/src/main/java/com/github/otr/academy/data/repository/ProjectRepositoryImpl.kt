package com.github.otr.academy.data.repository

import com.github.otr.academy.data.dto.project.ProjectsContainerDTO
import com.github.otr.academy.data.dto.project.ProjectDTO
import com.github.otr.academy.data.mapper.GenericMapper
import com.github.otr.academy.data.mapper.ProjectMapper
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.domain.entitiy.Project
import com.github.otr.academy.domain.repository.ProjectRepository

import retrofit2.Response

/**
 *
 */
class ProjectRepositoryImpl(
    private val mapper: GenericMapper<ProjectDTO, Project> = ProjectMapper() // TODO: Replace with Inject
) : ProjectRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getProjectById(projectId: Int): Project {
        apiClient.getProjectById(projectId).let { response: Response<ProjectsContainerDTO> ->
            val body: ProjectsContainerDTO? = response.body()
            if (response.isSuccessful && body != null) {
                val projectDTO: ProjectDTO =  body.projects.first { it.id == projectId }
                val project: Project = mapper.mapDtoToDomainEntity(projectDTO)
                return  project
            } else {
                throw RuntimeException("Response code 200 or couldn't parse JSON")
            }
        }
    }

}
