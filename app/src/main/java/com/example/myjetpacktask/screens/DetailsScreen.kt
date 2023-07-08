package com.example.myjetpacktask.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.composable.BottomSheet
import com.example.myjetpacktask.composable.Button
import com.example.myjetpacktask.composable.ImageAvatar
import com.example.myjetpacktask.ui.theme.ButtonBackgroundTransparentColor
import com.example.myjetpacktask.composable.IconButton
import com.example.myjetpacktask.ui.theme.ButtonOrangeColor

@Composable
fun DetailsScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(modifier = Modifier.weight(1f)) {

            ImageAvatar(
                painter = painterResource(id = R.drawable.details_image),
                contentDescription = "Poster Ticket Image",
                modifier = Modifier.height(400.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp),
            ) {
                IconButton(
                    icon = painterResource(id = R.drawable.close_icon),
                    colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonBackgroundTransparentColor)
                )

                Button(
                    icon = painterResource(id = R.drawable.time_icon),
                    text = "2h 23m",
                    modifier = Modifier
                        .width(90.dp)
                        .height(24.dp)
                        .clip(RoundedCornerShape(100)),
                    colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonBackgroundTransparentColor)
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth().height(470.dp).align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    size = 56,
                    icon = painterResource(id = R.drawable.play_icon),
                    colors = IconButtonDefaults.iconButtonColors(containerColor = ButtonOrangeColor)
                )
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        BottomSheet(modifier = Modifier.align(Alignment.BottomCenter))
    }
}


@Preview(showBackground = true, locale = "En")
@Composable
fun Preview() {
    DetailsScreen()
}

