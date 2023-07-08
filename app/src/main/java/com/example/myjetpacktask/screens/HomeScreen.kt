package com.example.myjetpacktask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.composable.BottomNavigation
import com.example.myjetpacktask.composable.Button
import com.example.myjetpacktask.composable.Chips
import com.example.myjetpacktask.composable.ViewPager
import com.example.myjetpacktask.composable.images
import com.example.myjetpacktask.ui.theme.ButtonBackgroundTransparentColor
import com.example.myjetpacktask.ui.theme.ButtonOrangeColor
import com.example.myjetpacktask.ui.theme.PrimaryTextColorLight
import com.example.myjetpacktask.ui.theme.SecondaryTextColorDark
import com.example.myjetpacktask.ui.theme.SecondaryTextColorLight
import com.example.myjetpacktask.ui.theme.White
import com.example.myjetpacktask.ui.theme.nunito

@Composable
fun HomeScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.design2),
            contentDescription = "Background Image",
            modifier = Modifier
                .fillMaxSize()
                .blur(70.dp),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 32.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Transparent,
                            SecondaryTextColorDark,
                            White,
                            White,
                        )
                    )
                )
        )

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 32.dp), color = Color.Transparent, contentColor = Color.White
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Chips(
                        text = "Now Showing",
                        color = ButtonOrangeColor,
                        shape = CircleShape,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        textColor = White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Chips(
                        text = "Coming Soon",
                        borderColor = White,
                        shape = CircleShape,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        textColor = White
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                ViewPager(Images = images)

                Spacer(modifier = Modifier.height(32.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        icon = painterResource(id = R.drawable.time_icon),
                        text = "2h 23m",
                        color= PrimaryTextColorLight,
                        modifier = Modifier
                            .width(90.dp)
                            .height(24.dp)
                            .clip(RoundedCornerShape(100)),
                        colors = IconButtonDefaults.iconButtonColors(containerColor = Color.Transparent)
                    )
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
                Spacer(modifier = Modifier.weight(1f))
                BottomNavigation()


            }
        }
    }
}

@Preview(showSystemUi = true, locale = "En")
@Composable
fun PreviewHome() {
    HomeScreen()
}

