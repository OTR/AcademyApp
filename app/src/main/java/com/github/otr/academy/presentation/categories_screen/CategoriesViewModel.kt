package com.github.otr.academy.presentation.categories_screen

import androidx.lifecycle.ViewModel

import com.github.otr.academy.domain.Category

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 *
 */
class CategoriesViewModel : ViewModel() {

    private val _categoriesFlow: Flow<List<Category>> = flow {  }
    val categoriesFlow: Flow<List<Category>> = _categoriesFlow

    fun getCategories() {

    }

    fun loadCategories() {

    }

}
