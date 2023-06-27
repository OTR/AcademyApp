package com.github.otr.academy.presentation.categories_screen.component.category

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.presentation.theme.CATEGORY_CHIP_TRAILING_TEXT_PADDING_VALUES
import com.github.otr.academy.presentation.theme.getCategoryChipBorder
import com.github.otr.academy.presentation.theme.getCategoryChipColors
import com.github.otr.academy.presentation.theme.getTrailingTextBackgroundColor
import com.github.otr.academy.presentation.theme.getTrailingTextColor

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

    FilterChip(
        selected = selected,
        onClick = { onClickListener(category) },
        border = getCategoryChipBorder(selected),
        colors = getCategoryChipColors(),
        trailingIcon = {
            Text(
                color = getTrailingTextColor(selected),
                modifier = Modifier
                    .background(
                        color = getTrailingTextBackgroundColor(selected),
                        shape = MaterialTheme.shapes.small
                    )
                    .padding(CATEGORY_CHIP_TRAILING_TEXT_PADDING_VALUES)
                ,
                text = category.tracksCount.toString()
            )
        },
        modifier = modifier
    ) {
        Text(text = category.title)
    }

}
