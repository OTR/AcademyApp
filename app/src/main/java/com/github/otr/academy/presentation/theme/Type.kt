package com.github.otr.academy.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

private val H1_TEXT_FONT_SIZE: TextUnit = 32.sp
private val H2_TEXT_FONT_SIZE: TextUnit = 28.sp
private val H3_TEXT_FONT_SIZE: TextUnit = 24.sp
private val H4_TEXT_FONT_SIZE: TextUnit = 20.sp
private val BODY1_TEXT_FONT_SIZE: TextUnit = 16.sp

/**
 * Set of Material typography styles to start with
 */
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = H1_TEXT_FONT_SIZE
    ),

    h2 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = H2_TEXT_FONT_SIZE
    ),

    h3 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = H3_TEXT_FONT_SIZE
    ),

    h4 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = H4_TEXT_FONT_SIZE
    ),

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = BODY1_TEXT_FONT_SIZE
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
