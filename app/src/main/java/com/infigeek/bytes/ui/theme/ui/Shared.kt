package com.infigeek.bytes.ui.theme.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.infigeek.bytes.ui.theme.R


@Composable
fun GenericAppBar(
    title: String,
    onIconClick: (() -> Unit)?,
    icon: @Composable() (() -> Unit)?,
    iconState: MutableState<Boolean>
) {
    // Define a custom TextStyle for the title with manropebold.ttf
    val titleTextStyle = TextStyle(
        fontFamily = FontFamily(Font(R.font.manropebold)),
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        textAlign = TextAlign.Center
    )

    TopAppBar(
        title = {
            Text(
                text = title,
                style = titleTextStyle, // Apply the custom TextStyle with manropebold.ttf for the title
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            )
        },
        backgroundColor = Color(0x545E5F61),
        actions = {
            IconButton(
                onClick = {
                    onIconClick?.invoke()
                },
                content = {
                    if (iconState.value) {
                        icon?.invoke()
                    }
                }

            )
        },
        elevation = AppBarDefaults.TopAppBarElevation,
        modifier = Modifier.fillMaxWidth()
    )
}