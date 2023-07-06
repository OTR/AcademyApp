package com.github.otr.academy.presentation.categories_screen.component.category

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.github.otr.academy.presentation.theme.CATEGORY_CHIP_TRAILING_TEXT_PADDING_VALUES
import com.github.otr.academy.presentation.theme.getTrailingTextBackgroundColor
import com.github.otr.academy.presentation.theme.getTrailingTextColor

/**
 *
 */
@Composable
fun TracksCountText(
    tracksCount: Int,
    selected: Boolean,
    modifier: Modifier = Modifier
) {

    Text(
        color = getTrailingTextColor(selected),
        modifier = Modifier
            .background(
                color = getTrailingTextBackgroundColor(selected),
                shape = MaterialTheme.shapes.small
            )
            .padding(CATEGORY_CHIP_TRAILING_TEXT_PADDING_VALUES)
        ,
        text = tracksCount.toString()
    )

}
