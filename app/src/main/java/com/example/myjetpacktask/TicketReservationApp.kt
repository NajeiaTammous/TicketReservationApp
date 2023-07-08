package com.example.myjetpacktask

import androidx.compose.runtime.Composable
import com.example.myjetpacktask.screens.BookingScreen
import com.example.myjetpacktask.screens.DetailsScreen
import com.example.myjetpacktask.screens.HomeScreen
import com.example.myjetpacktask.ui.theme.MyJetpackTaskTheme

@Composable
fun TicketReservationApp(){
    MyJetpackTaskTheme() {
        DetailsScreen()
        }
}