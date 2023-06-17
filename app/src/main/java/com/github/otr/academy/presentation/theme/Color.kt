package com.github.otr.academy.presentation.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SelectableChipColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val Teal500 = Color(0xFF4CAF50)

/**
 *
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun getCategoryChipColors(): SelectableChipColors = ChipDefaults.filterChipColors(
    contentColor = MaterialTheme.colors.onBackground,
    backgroundColor = MaterialTheme.colors.background,
    selectedContentColor = MaterialTheme.colors.onBackground,
    selectedBackgroundColor = MaterialTheme.colors.background,
)

/**
 *
 */
@Composable
fun getCategoryChipBorder(selected: Boolean): BorderStroke {
    return if (selected) {
        BorderStroke(
            width = CATEGORY_CHIP_SELECTED_BORDER_WIDTH,
            color = MaterialTheme.colors.primary
        )
    } else {
        BorderStroke(
            width = CATEGORY_CHIP_UNSELECTED_BORDER_WIDTH,
            color = MaterialTheme.colors.surface.copy(alpha = 0.3f)
        )
    }
}

/**
 *
 */
@Composable
fun getTrailingTextColor(selected: Boolean): Color {
    return if (selected) {
        MaterialTheme.colors.onPrimary
    } else {
        MaterialTheme.colors.onSurface
    }
}

@Composable
fun getTrailingTextBackgroundColor(selected: Boolean): Color {
    return if (selected) {
        MaterialTheme.colors.primary
    } else {
        MaterialTheme.colors.surface.copy(alpha = 0.7f)
    }
}
