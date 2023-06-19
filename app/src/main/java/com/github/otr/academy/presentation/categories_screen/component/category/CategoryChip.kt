package com.github.otr.academy.presentation.categories_screen.component.category

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
    selected: Boolean
) {

    FilterChip(
        onClick = { onClickListener(category) },
        colors = getCategoryChipColors(),
        border = getCategoryChipBorder(selected),
        selected = selected,
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
        }
    ) {
        Text(text = category.title)
    }

}
