package com.example.myjetpacktask.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.R
import com.example.myjetpacktask.ui.theme.PrimaryTextColorLight
import com.example.myjetpacktask.ui.theme.SecondaryTextColorLight

@Composable
fun BottomNavigation() {
    val navItems = listOf(
        R.drawable.ic_home, R.drawable.ic_search, R.drawable.ic_ticket, R.drawable.ic_user
    )

    Row {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            content = {
                items(navItems) { navItem ->
                    val backgroundColor = if (navItems.indexOf(navItem) == 0) {
                        Color(0xFFFA6236) // Set your desired orange color value
                    } else {
                        Color.Transparent
                    }

                    Box(
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .background(color = backgroundColor)
                            .clip(RoundedCornerShape(100))
                            .size(48.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(navItem),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = SecondaryTextColorLight
                        )
                    }
                }
            }
        )
    }
}

@Preview(showSystemUi = true, locale = "En")
@Composable
fun PreviewHere() {
    BottomNavigation()
}