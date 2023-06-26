package com.github.otr.academy.presentation.extensions

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

private val FIRST_LINE_INDENT_VALUE: TextUnit = 20.sp

/**
 *
 */
fun String.firstLineIndentedParagraph(): AnnotatedString {
    return buildAnnotatedString {
        withStyle(
            ParagraphStyle(
                textAlign = TextAlign.Justify,
                textIndent = TextIndent(firstLine = FIRST_LINE_INDENT_VALUE)
            )
        ) {
            append(this@firstLineIndentedParagraph)
        }
    }
}
