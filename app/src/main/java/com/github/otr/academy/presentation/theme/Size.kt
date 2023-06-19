package com.github.otr.academy.presentation.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val CATEGORY_CHIP_SELECTED_BORDER_WIDTH: Dp = 2.dp
val CATEGORY_CHIP_UNSELECTED_BORDER_WIDTH: Dp = 1.dp

val DEFAULT_HORIZONTAL_PADDING: Dp = 4.dp
val DEFAULT_VERTICAL_PADDING: Dp = 4.dp

/* VALUES FOR CATEGORIES HEADER */
val H1_TEXT_PADDING_VALUES: PaddingValues = PaddingValues(
    horizontal = DEFAULT_HORIZONTAL_PADDING * 4,
    vertical = DEFAULT_VERTICAL_PADDING * 4
)

val H2_TEXT_PADDING_VALUES: PaddingValues = PaddingValues(
    horizontal = DEFAULT_HORIZONTAL_PADDING * 4,
    vertical = DEFAULT_VERTICAL_PADDING * 3
)

val BODY1_TEXT_PADDING_VALUES: PaddingValues = PaddingValues(
    horizontal = DEFAULT_HORIZONTAL_PADDING * 4,
    vertical = DEFAULT_VERTICAL_PADDING * 2
)

/* VALUES FOR CATEGORY CHIP */
const val MAX_CATEGORY_CHIPS_IN_EACH_ROW: Int = 4
val CATEGORY_CHIPS_FLOW_ROW_PADDING_VALUES: PaddingValues = PaddingValues(
    all = DEFAULT_VERTICAL_PADDING
)
val CATEGORY_CHIP_TRAILING_TEXT_PADDING_VALUES: PaddingValues = PaddingValues(
    horizontal = DEFAULT_HORIZONTAL_PADDING
)
