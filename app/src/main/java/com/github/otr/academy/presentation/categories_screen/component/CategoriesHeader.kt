package com.github.otr.academy.presentation.categories_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import com.github.otr.academy.R
import com.github.otr.academy.presentation.theme.BODY1_TEXT_PADDING_VALUES
import com.github.otr.academy.presentation.theme.H1_TEXT_PADDING_VALUES
import com.github.otr.academy.presentation.theme.H2_TEXT_PADDING_VALUES

/**
 *
 */
@Composable
fun CategoriesHeader() {

    Column(
        modifier = Modifier
    ) {
        Text(
            modifier = Modifier.padding(H1_TEXT_PADDING_VALUES),
            text = stringResource(id = R.string.categories_screen_title),
            style = MaterialTheme.typography.h1
        )
        Text(
            modifier = Modifier.padding(H2_TEXT_PADDING_VALUES),
            text = stringResource(id = R.string.categories_screen_sub_title),
            style = MaterialTheme.typography.h2
        )
        Text(
            modifier = Modifier.padding(BODY1_TEXT_PADDING_VALUES),
            text = stringResource(id = R.string.categories_screen_paragraph),
            style = MaterialTheme.typography.body1
        )
    }

}
