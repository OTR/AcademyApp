package com.github.otr.academy.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Purple200,
    onPrimary = Purple200,
    surface = Purple200,
    onSurface = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    onPrimary = Color.White,

    secondary = Teal200,
    onSecondary = Teal500,

    background = Color.White,
    onBackground = Color.Black,

    surface = Color.LightGray,
    onSurface = Color.Black,

    //Other default colors to override
    primaryVariant = Color.Gray,

)

/**
 * See about Colors system:
 * https://m2.material.io/design/color/the-color-system.html#color-theme-creation
 */
@Composable
fun AcademyAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}