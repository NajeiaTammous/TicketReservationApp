package com.example.myjetpacktask.composable

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.ui.theme.White

@Composable
fun IconButton(
    icon: Painter,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    modifier: Modifier = Modifier,
    size: Int = 32
) {

    IconButton(
        onClick = { },
        colors = colors,
        modifier = Modifier
            .clip(CircleShape)
            .height(size.dp)
            .width(size.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = White
        )
    }
}