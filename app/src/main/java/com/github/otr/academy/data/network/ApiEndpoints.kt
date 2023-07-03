package com.github.otr.academy.data.network

import com.github.otr.academy.data.dto.category.CategoriesContainerDTO
import com.github.otr.academy.data.dto.project.ProjectsContainerDTO
import com.github.otr.academy.data.dto.track.TracksContainerDTO

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 *
 */
interface ApiEndpoints {

    @GET("api/track-categories.json")
    suspend fun getCategories(): Response<CategoriesContainerDTO>

    @GET("api/tracks.json")
    suspend fun getTracks(): Response<TracksContainerDTO>

    @GET("api/projects/{project_id}.json")
    suspend fun getProjectById(
        @Path("project_id") projectId: Int
    ): Response<ProjectsContainerDTO>

}
