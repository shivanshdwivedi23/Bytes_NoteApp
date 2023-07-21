package com.infigeek.bytes.ui.theme.ui.theme

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Build
import androidx.compose.runtime.SideEffect
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

//@SuppressLint("ConflictingOnColor")
@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = Color(0xFF171C26),
    background = Color(0xFF171C26),
    onPrimary = Color.Black,
)

//#f6c2d9	(246,194,217)
//#fff69b	(255,246,155)
//#bcdfc9	(188,223,201)
//#a1c8e9	(161,200,233)
//#e4dae2	(228,218,226)

val noteBGYellow = Color(0xA85A66AA)
val noteBGBlue = Color(0xFFE4B167)


@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = Color(0xFF171C26),
    background = Color(0xFF171C26),
    onPrimary = Color.Black,
)

@Composable
fun BytesTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = darkColors(
            primary = Color(0xFF171C26), // Set primary color if needed
            onPrimary = Color(0xFF171C26), // Set text color on primary color if needed
            // Add other theme colors as needed
        ),
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}