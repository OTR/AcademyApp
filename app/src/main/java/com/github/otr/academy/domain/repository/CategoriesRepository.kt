package com.github.otr.academy.domain.repository

import com.github.otr.academy.domain.entitiy.Category

/**
 *
 */
interface CategoriesRepository {

    suspend fun getAllCategories(): List<Category>

}
