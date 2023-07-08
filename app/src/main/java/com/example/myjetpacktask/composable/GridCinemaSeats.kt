package com.example.myjetpacktask.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.ui.theme.Gray

@Composable
fun GridCinemaSeats() {
    val totalRows = 5
    val totalColumns = 3
    val totalSeats = totalRows * totalColumns

    LazyVerticalGrid(
        columns = GridCells.Fixed(totalColumns),
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(horizontal = 16.dp)

    ) {
        items(totalSeats) { seatIndex ->
            CinemaSeatItem()
        }
    }
}

@Composable
fun CinemaSeatItem() {
    Row(
        modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp), horizontalArrangement = Arrangement.Center,
    ) {
        Seat()
        Seat()
    }
}

@Composable
fun Seat() {
    Box(modifier = Modifier.padding(4.dp)) {
        Icon(
            painter = painterResource(id = R.drawable.sofa_svgrepo_com),
            tint = Gray,
            contentDescription = "sofa",
            modifier = Modifier
                .graphicsLayer { scaleY = -1f }
                .width(32.dp)
                .height(32.dp)
        )
    }
}

@Preview(showSystemUi = true, locale = "En")
@Composable
fun PreviewNow() {
    GridCinemaSeats()
}