package com.example.myjetpacktask.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.ui.theme.ButtonOrangeColor
import com.example.myjetpacktask.ui.theme.nunito
import com.example.myjetpacktask.ui.theme.PrimaryTextColorLight
import com.example.mypersonaltask.composable.SpacerVertical16
import com.example.mypersonaltask.composable.SpacerVertical24
import com.example.mypersonaltask.composable.SpacerVertical8

@Composable
fun BottomSheet(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .clip(RoundedCornerShape(topEnd = 32.dp, topStart = 32.dp))
                .align(Alignment.BottomCenter),
            elevation = CardDefaults.cardElevation(0.dp)
        ) {
            SpacerVertical16()
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
            ) {
                RowText(upperText = "6.8", lowerText = "IMDb", besideUpperText = "/10")
                RowText(upperText = "63%", lowerText = "Rotten Tomatoes")
                RowText(upperText = "4", lowerText = "IGN", besideUpperText = "/10")
            }
            Text(
                text = stringResource(R.string.Movie_Title),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 16.dp, horizontal = 24.dp),
                fontFamily = nunito,
                lineHeight = 32.sp,
                fontWeight = FontWeight.Medium,
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                color = PrimaryTextColorLight
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Chips(text = "Fantasy", shape = CircleShape, borderColor = Color.LightGray, modifier = Modifier.padding(horizontal = 8.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Chips(text = "Adventure", shape = CircleShape, borderColor = Color.LightGray, modifier = Modifier.padding(horizontal = 8.dp))
            }
            SpacerVertical24()
            RowOfCircularPictures(actorPictures)
            Text(
                text = stringResource(R.string.description_movie_details),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 16.dp, horizontal = 24.dp),
                fontFamily = nunito,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                maxLines = 3,
                textAlign = TextAlign.Center,
                color = PrimaryTextColorLight
            )
            SpacerVertical8()
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                icon = painterResource(id = R.drawable.booking_icon),
                text = "Booking",
                colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonOrangeColor)
            )
        }
    }
}


@Preview(showSystemUi = true, locale = "En")
@Composable
fun Preview() {
    BottomSheet()
}