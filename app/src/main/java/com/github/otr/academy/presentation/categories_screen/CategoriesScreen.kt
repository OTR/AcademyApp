package com.github.otr.academy.presentation.categories_screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.presentation.categories_screen.component.CategoriesHeader
import com.github.otr.academy.presentation.categories_screen.component.category.CategoryChips
import com.github.otr.academy.presentation.categories_screen.component.track.TrackCard
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 * Vertically scrollable component was measured with an infinity maximum height
 * constraints, which is disallowed. One of the common reasons is nesting layouts
 * like LazyColumn and Column(Modifier.verticalScroll()).
 * If you want to add a header before the list of items please add a header
 * as a separate item() before the main items() inside the LazyColumn scope.
 * There are could be other reasons for this to happen: your ComposeView was
 * added into a LinearLayout with some weight,
 * you applied Modifier.wrapContentSize(unbounded = true)
 * or wrote a custom layout. Please try to remove the source
 * of infinite constraints in the hierarchy above the scrolling container.

 */
@Composable
fun CategoriesScreen() {

    val categoriesViewModel: CategoriesViewModel = viewModel()
    val tracksViewModel: TracksViewModel = viewModel()

    val categoriesState: State<CategoriesState> = categoriesViewModel
        .categoriesFlow
        .collectAsState()
    val currCategoriesState: CategoriesState = categoriesState.value

    val onCategoryChipClickListener: (Category) -> Unit = categoriesViewModel::changeSelectedCategory

    val selectedCategory: Category? = currCategoriesState.categories.find {
        it.id == currCategoriesState.selectedCategoryId
    }

    val selectedTracks: List<Track> = selectedCategory?.let {
        tracksViewModel.getTracksByCategory(it)
    } ?: emptyList()

    Log.d("LOG", "Recomposition")

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(DEFAULT_VERTICAL_PADDING * 2)
    ) {
        item {CategoriesHeader()}
        item { CategoryChips(currCategoriesState, onCategoryChipClickListener) }
        items(items = selectedTracks, key = { it.id }) {
            TrackCard(track = it)
        }
    }

}
