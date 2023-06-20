package com.github.otr.academy.presentation.track_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

import com.github.otr.academy.R
import com.github.otr.academy.presentation.theme.DEFAULT_HORIZONTAL_PADDING
import com.github.otr.academy.presentation.theme.DEFAULT_VERTICAL_PADDING

/**
 *
 */
@Composable
fun TrackScreenTrackLongDescription(longDescription: String) {

    Column() {
        Text(
            modifier = Modifier.padding(
                horizontal = DEFAULT_HORIZONTAL_PADDING * 4,
                vertical = DEFAULT_VERTICAL_PADDING * 2
            ),
            style = MaterialTheme.typography.h2,
            text = stringResource(R.string.track_screen_long_desc_title)
        )
        Text(
            modifier = Modifier.padding(horizontal = DEFAULT_HORIZONTAL_PADDING * 3),
//
            text = longDescription.firstLineIndentedParagraph()
        )

    }

}

/**
 *
 */
fun String.firstLineIndentedParagraph(): AnnotatedString {
    return buildAnnotatedString {
        withStyle(
            ParagraphStyle(
                textAlign = TextAlign.Justify,
                textIndent = TextIndent(firstLine = 20.sp)
            )
        ) {
            append(this@firstLineIndentedParagraph)
        }
    }
}
