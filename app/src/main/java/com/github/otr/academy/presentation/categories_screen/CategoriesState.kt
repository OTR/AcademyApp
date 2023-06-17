package com.github.otr.academy.presentation.categories_screen

import com.github.otr.academy.domain.entitiy.Category

/**
 *
 */
sealed class CategoriesState(
    val categories: List<Category>,
    val selectedCategoryId: Int
) {

    companion object {
        const val ALL_TRACKS_CATEGORY_ID: Int = 8
    }

    object Initial : CategoriesState(
        categories = emptyList(),
        selectedCategoryId = ALL_TRACKS_CATEGORY_ID
    )

    class Categories(
        categories: List<Category>,
        selectedCategoryId: Int
    ) : CategoriesState(
        categories = categories,
        selectedCategoryId = selectedCategoryId
    )

}
