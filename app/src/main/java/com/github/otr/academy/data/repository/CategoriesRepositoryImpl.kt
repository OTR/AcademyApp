package com.github.otr.academy.data.repository

import com.github.otr.academy.data.dto.category.CategoriesContainerDTO
import com.github.otr.academy.data.dto.category.CategoryDTO
import com.github.otr.academy.data.mapper.CategoryMapper
import com.github.otr.academy.data.mapper.GenericMapper
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.repository.CategoriesRepository

import retrofit2.Response

/**
 *
 */
class CategoriesRepositoryImpl constructor(
    private val mapper: GenericMapper<CategoryDTO, Category> = CategoryMapper() // TODO: Replace with Inject
): CategoriesRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getAllCategories(): List<Category> {
        apiClient.getCategories().let { response: Response<CategoriesContainerDTO> ->
            val body = response.body()
            if (response.isSuccessful && body != null) {
                return body.categories.map {dto: CategoryDTO ->
                    mapper.mapDtoToDomainEntity(dto)
                }
            } else {
                throw RuntimeException("Response code != 200 or Couldn't parse JSON object")
            }
        }
    }

}
