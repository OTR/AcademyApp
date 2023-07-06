package com.github.otr.academy.presentation.categories_screen.component.category

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.presentation.theme.getCategoryChipBorder
import com.github.otr.academy.presentation.theme.getCategoryChipColors

/**
 * See more about colors of enabled and disabled state:
 * https://developer.android.com/jetpack/compose/designsystems/material#component-states
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryChip(
    category: Category,
    onClickListener: (Category) -> Unit,
    selected: Boolean,
    modifier: Modifier = Modifier
) {

    val tracksCount: Int = category.tracksCount

    FilterChip(
        selected = selected,
        onClick = { onClickListener(category) },
        border = getCategoryChipBorder(selected),
        colors = getCategoryChipColors(),
        trailingIcon = { TracksCountText(tracksCount = tracksCount, selected = selected) },
        modifier = modifier
    ) {
        Text(text = category.title)
    }

}
