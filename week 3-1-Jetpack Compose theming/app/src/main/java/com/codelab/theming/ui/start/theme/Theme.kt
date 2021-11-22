package com.codelab.theming.ui.start.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.codelab.theming.ui.finish.theme.JetnewsTypography

private val LightColors = lightColors(
    primary = com.codelab.theming.ui.finish.theme.Red700,
    primaryVariant = com.codelab.theming.ui.finish.theme.Red900,
    onPrimary = Color.White,
    secondary = com.codelab.theming.ui.finish.theme.Red700,
    secondaryVariant = com.codelab.theming.ui.finish.theme.Red900,
    onSecondary = Color.White,
    error = com.codelab.theming.ui.finish.theme.Red800
)

private val DarkColors = darkColors(
    primary = com.codelab.theming.ui.finish.theme.Red300,
    primaryVariant = com.codelab.theming.ui.finish.theme.Red700,
    onPrimary = Color.Black,
    secondary = com.codelab.theming.ui.finish.theme.Red300,
    onSecondary = Color.Black,
    error = com.codelab.theming.ui.finish.theme.Red200
)

@Composable
fun JetnewsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = JetnewsTypography,
        shapes = com.codelab.theming.ui.finish.theme.JetnewsShapes,
        content = content
    )
}