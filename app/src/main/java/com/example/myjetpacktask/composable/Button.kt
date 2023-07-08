package com.example.myjetpacktask.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpacktask.ui.theme.White
import com.example.myjetpacktask.ui.theme.nunito

@Composable
fun Button(
    icon: Painter? = null,
    modifier: Modifier = Modifier,
    text: String = "",
    size:Int = 8,
    color:Color = White,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors()
) {
    IconButton(
        onClick = { },
        modifier = modifier
            .width(124.dp)
            .height(48.dp)
            .clip(RoundedCornerShape(100)),
        colors = colors
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 2.dp)) {
            icon?.let { icon ->
                Icon(
                    painter = icon,
                    contentDescription = null,
                    tint = color
                )
            }
            Spacer(modifier = Modifier.width(size.dp))
            Text(
                text, color = color, fontFamily = nunito,
                fontWeight = FontWeight.Medium, fontSize = 14.sp
            )
        }
    }
}