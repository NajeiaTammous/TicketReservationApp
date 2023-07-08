package com.example.myjetpacktask

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjetpacktask.composable.Chips
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

@Composable
fun RowCalendar() {
    val datesWithDays = generateDatesWithDays()

    LazyRow(
        modifier = Modifier.padding(start = 16.dp),
        content = {
            items(datesWithDays) { (dayOfMonth, dayOfWeek) ->
                DateDayItem(dayOfMonth = dayOfMonth, dayOfWeek = dayOfWeek)
            }
        }
    )
}

@Composable
fun DateDayItem(dayOfMonth: Int, dayOfWeek: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 4.dp)
    ) {
        Chips(text = dayOfMonth.toString(),
            secondaryText = dayOfWeek,
            shape = RoundedCornerShape(16.dp),
           fontWeight = FontWeight.Bold,
            fontSize = 16,
            borderColor = Color.LightGray,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

private fun generateDatesWithDays(): List<Pair<Int, String>> {
    val datesWithDays = mutableListOf<Pair<Int, String>>()
    val dateFormat = SimpleDateFormat("EEE", Locale.ENGLISH)

    repeat(7) {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, it)
        datesWithDays.add(date.get(Calendar.DAY_OF_MONTH) to dateFormat.format(date.time))
    }

    return datesWithDays
}

@Preview(showSystemUi = true, locale = "En")
@Composable
fun PreviewRow() {
    RowCalendar()
}