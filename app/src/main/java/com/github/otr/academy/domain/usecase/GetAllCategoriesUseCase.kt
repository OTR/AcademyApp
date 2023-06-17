package com.github.otr.academy.domain.usecase

import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.repository.CategoriesRepository

/**
 *
 */
class GetAllCategoriesUseCase(
    private val repository: CategoriesRepository
) {

    suspend operator fun invoke(): List<Category> {
        return repository.getAllCategories()
    }

}
