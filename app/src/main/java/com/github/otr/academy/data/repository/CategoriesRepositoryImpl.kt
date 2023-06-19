package com.github.otr.academy.data.repository

import android.util.Log
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.repository.CategoriesRepository

/**
 *
 */
class CategoriesRepositoryImpl: CategoriesRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getAllCategories(): List<Category> {
        apiClient.getCategories().let {
            val body = it.body()
            if (it.isSuccessful && body != null) {
                return body.categories.map { it.mapToCategory() }
            } else {
                throw RuntimeException("Response code != 200 or Couldn't parse JSON object")
            }
        }
    }

}
