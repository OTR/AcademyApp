package com.github.otr.academy.data.repository

import com.github.otr.academy.data.dto.categories.CategoriesContainerDTO
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.repository.CategoriesRepository

import retrofit2.Response

/**
 *
 */
class CategoriesRepositoryImpl: CategoriesRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getAllCategories(): List<Category> {
        apiClient.getCategories().let { response: Response<CategoriesContainerDTO> ->
            val body = response.body()
            if (response.isSuccessful && body != null) {
                return body.categories.map { it.mapToCategory() }
            } else {
                throw RuntimeException("Response code != 200 or Couldn't parse JSON object")
            }
        }
    }

}
