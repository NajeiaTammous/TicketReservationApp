package com.example.myjetpacktask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.RowCalendar
import com.example.myjetpacktask.composable.Button
import com.example.myjetpacktask.composable.Chips
import com.example.myjetpacktask.composable.GridCinemaSeats
import com.example.myjetpacktask.composable.IconButton
import com.example.myjetpacktask.composable.RowCircleWithText
import com.example.myjetpacktask.composable.RowText
import com.example.myjetpacktask.ui.theme.ButtonBackgroundTransparentColor
import com.example.myjetpacktask.ui.theme.ButtonOrangeColor
import com.example.myjetpacktask.ui.theme.Gray
import com.example.myjetpacktask.ui.theme.White
import com.example.mypersonaltask.composable.SpacerVertical16
import com.example.mypersonaltask.composable.SpacerVertical24
import com.example.mypersonaltask.composable.SpacerVertical32
import com.example.mypersonaltask.composable.SpacerVertical8

@Composable
fun BookingScreen(color: Color = Color.Black) {

    val cinemaTimes = listOf("10:00", "12:30", "15:30", "18:30", "21:30", "23:00")

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(color)
        )
        {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 32.dp)
                ) {
                    IconButton(
                        icon = painterResource(id = R.drawable.close_icon),
                        colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonBackgroundTransparentColor)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.poster),
                    contentDescription = "Movie poster in cinema",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(top = 24.dp),
                    contentScale = ContentScale.FillWidth,
                )
                SpacerVertical32()
                GridCinemaSeats()
                SpacerVertical32()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    RowCircleWithText("Avaliable", White)
                    RowCircleWithText("Taken", Gray)
                    RowCircleWithText("Selected", ButtonOrangeColor)

                }
            }
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topEnd = 32.dp, topStart = 32.dp)),
            elevation = CardDefaults.cardElevation(0.dp)
        ) {
            SpacerVertical32()
            SpacerVertical8()
            RowCalendar()
            SpacerVertical16()
            LazyRow(
                modifier = Modifier.padding(start = 16.dp),
                content = {
                    items(cinemaTimes) { time ->
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(horizontal = 4.dp)
                        ) {
                            Chips(
                                text = time,
                                shape = CircleShape,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                borderColor = Color.LightGray
                            )
                        }
                    }
                }
            )
            SpacerVertical32()
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                RowText(
                    upperText = "$100.00",
                    lowerText = "4 tickets",
                    fontWeight = FontWeight.Bold,
                    size = 22,
                    textAlignment = Alignment.Start
                )
                Button(
                    icon = painterResource(id = R.drawable.booking_icon),
                    text = "Buy tickets",
                    modifier = Modifier.width(150.dp),
                    colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonOrangeColor)
                )
            }
        }
    }
}

@Preview(showBackground = true, locale = "En")
@Composable
fun PreviewBooking() {
    BookingScreen()
}


