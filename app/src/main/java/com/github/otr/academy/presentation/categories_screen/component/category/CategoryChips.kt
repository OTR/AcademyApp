package com.github.otr.academy.presentation.categories_screen.component.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.presentation.categories_screen.CategoriesState
import com.github.otr.academy.presentation.theme.CATEGORY_CHIPS_FLOW_ROW_PADDING_VALUES
import com.github.otr.academy.presentation.theme.MAX_CATEGORY_CHIPS_IN_EACH_ROW

/**
 *
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CategoryChips(
    categoriesState: CategoriesState,
    onCategoryChipClickListener: (Category) -> Unit,
    modifier: Modifier = Modifier
) {

    val categories: List<Category> = categoriesState.categories
    val selectedCategoryId: Int = categoriesState.selectedCategoryId

    FlowRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(CATEGORY_CHIPS_FLOW_ROW_PADDING_VALUES),
        horizontalArrangement = Arrangement.SpaceEvenly,
        maxItemsInEachRow = MAX_CATEGORY_CHIPS_IN_EACH_ROW
    ) {
        categories.forEach {
            val selected: Boolean = it.id == selectedCategoryId
            CategoryChip(
                category = it,
                selected = selected,
                onClickListener = onCategoryChipClickListener
            )
        }
    }

}
