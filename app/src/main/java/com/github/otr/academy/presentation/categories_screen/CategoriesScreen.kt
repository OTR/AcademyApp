package com.github.otr.academy.presentation.categories_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.otr.academy.domain.Category

/**
 *
 */
@Composable
fun CategoriesScreen() {

    val categoriesViewModel: CategoriesViewModel = viewModel()

    val categoriesState: State<List<Category>> = categoriesViewModel
        .categoriesFlow
        .collectAsState(initial = emptyList())

}
