package com.example.myjetpacktask.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpacktask.ui.theme.nunito
import com.example.myjetpacktask.ui.theme.PrimaryTextColorLight
import com.example.myjetpacktask.ui.theme.SecondaryTextColorLight

@Composable
fun Chips(
    text: String,
    secondaryText: String? = null,
    modifier: Modifier = Modifier,
    color: Color = Color.Transparent,
    borderColor: Color = Color.Transparent,
    shape: Shape,
    textColor: Color = PrimaryTextColorLight,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: Int = 12
) {
    Surface(
        color = color,
        contentColor = Color.LightGray,
        shape = shape,
        border = BorderStroke(
            width = 1.dp,
            color = borderColor
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(4.dp)
        ) {

            Text(
                text = text,
                color = textColor,
                textAlign = TextAlign.Center,
                fontWeight = fontWeight,
                fontSize = fontSize.sp,
                fontFamily = nunito,
            )
            secondaryText?.let { secondaryText ->
                Text(
                    text = secondaryText,
                    color = SecondaryTextColorLight,
                    fontSize = 12.sp,
                    fontFamily = nunito,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
    }
}

@Preview(showSystemUi = true, locale = "En")
@Composable
fun PreviewChips() {

}