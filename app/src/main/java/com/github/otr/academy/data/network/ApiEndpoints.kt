package com.github.otr.academy.data.network

import com.github.otr.academy.data.dto.categories.CategoriesContainerDTO
import com.github.otr.academy.data.dto.tracks.TracksDTO

import retrofit2.Response
import retrofit2.http.GET

/**
 *
 */
interface ApiEndpoints {

    @GET("api/track-categories.json")
    suspend fun getCategories(): Response<CategoriesContainerDTO>

    @GET("api/tracks.json")
    suspend fun getTracks(): Response<TracksDTO>

}
