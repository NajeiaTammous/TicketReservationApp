package com.example.myjetpacktask.composable

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpacktask.ui.theme.nunito
import com.example.myjetpacktask.ui.theme.PrimaryTextColorLight
import com.example.myjetpacktask.ui.theme.SecondaryTextColorDark
import com.example.myjetpacktask.ui.theme.SecondaryTextColorLight

@Composable
fun RowText(
    upperText: String,
    lowerText: String,
    besideUpperText: String = "",
    size: Int = 14,
    fontWeight: FontWeight = FontWeight.SemiBold,
    textAlignment: Alignment.Horizontal = Alignment.CenterHorizontally
) {

    Column(horizontalAlignment = textAlignment) {
        Row(modifier = Modifier.padding(vertical = 4.dp)) {
            Text(
                upperText,
                color = PrimaryTextColorLight,
                fontSize = size.sp,
                fontFamily = nunito,
                fontWeight = fontWeight
            )

            Text(
                besideUpperText,
                color = SecondaryTextColorLight,
                fontSize = 14.sp,
                fontFamily = nunito,
                fontWeight = FontWeight.SemiBold
            )

        }
        Text(
            lowerText,
            color = SecondaryTextColorLight,
            fontSize = 12.sp,
            fontFamily = nunito,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.align(textAlignment)

        )
    }
}

@Composable
fun RowCircleWithText(
    text: String,
    color: Color = Color.Transparent
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box() {
            Canvas(
                modifier = Modifier.padding(8.dp)
            ) {
                drawCircle(
                    brush = Brush.horizontalGradient(colors = listOf(color,color)),
                    radius = 4.dp.toPx()
                )
            }
        }

        Text(
            text,
            color = SecondaryTextColorDark,
            fontSize = 12.sp,
            fontFamily = nunito,
            fontWeight = FontWeight.Medium,
        )
    }
}

