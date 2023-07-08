package com.example.myjetpacktask.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.R

@Composable
fun CircularPicture(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentDescription: String?,
    size: Int = 60
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier
            .clip(CircleShape)
            .size(size.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun RowOfCircularPictures(actorPictureIds: List<Int>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth().padding(start = 24.dp),
        content = {
            items(actorPictureIds) { actorPictureId ->
                Box(
                    modifier = Modifier.padding(horizontal = 4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularPicture(
                        painter = painterResource(actorPictureId),
                        contentDescription = null
                    )
                }
            }
        }
    )
}

val actorPictures = listOf(
    R.drawable.profile_pic,
    R.drawable.profile_pic2,
    R.drawable.profile_pic3,
    R.drawable.profile_pic4,
    R.drawable.profile_pic5,
    R.drawable.profile_pic6,
)
