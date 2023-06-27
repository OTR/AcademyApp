package com.github.otr.academy.presentation.categories_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.github.otr.academy.data.repository.CategoriesRepositoryImpl
import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.repository.CategoriesRepository
import com.github.otr.academy.domain.usecase.GetAllCategoriesUseCase

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 *
 */
class CategoriesViewModel : ViewModel() {

    private val repository: CategoriesRepository = CategoriesRepositoryImpl()
    private val getAllCategoriesUseCase = GetAllCategoriesUseCase(repository)

    private var _categoriesFlow: MutableStateFlow<CategoriesState> = MutableStateFlow(
        value = CategoriesState.Initial
    )
    val categoriesFlow: StateFlow<CategoriesState> = _categoriesFlow.asStateFlow()

    init {
        viewModelScope.launch {
            val categories: List<Category> = getCategories()
            val stateToEmit: CategoriesState = CategoriesState.Categories(
                categories = categories,
                selectedCategoryId = CategoriesState.ALL_TRACKS_CATEGORY_ID
            )
            _categoriesFlow.emit(value = stateToEmit)
        }
    }

    private suspend fun getCategories(): List<Category> {
        val categories: List<Category> = getAllCategoriesUseCase()
        return categories
    }

    fun changeSelectedCategory(category: Category) {
        val categories = categoriesFlow.value.categories
        val selectedCategoryId = categories.find {
            it.id == category.id
        }?.id
            ?: CategoriesState.ALL_TRACKS_CATEGORY_ID

        _categoriesFlow.value =
            CategoriesState.Categories(
                categories,
                selectedCategoryId
            )
    }

}
