package com.example.pruebacompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun ScaffoldLayout() {
    var contador by remember { mutableStateOf(0)}
    Scaffold(
        topBar = {
            //TopAppBar(title = "App bar")
        },
        floatingActionButton = {
        FloatingActionButton(
            onClick = {contador++},
            shape = CircleShape,
            containerColor = Color.White,
            contentColor = Color.DarkGray) {
            Text(text = "+", fontSize = 20.sp)
        }
    }){
        innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)
            .background(color = Color.LightGray)
            .fillMaxSize()) {
            Text(text = "Contador número $contador", modifier = Modifier.padding(16.dp),
                color = Color.White,
                fontSize = 23.sp)
        }
    }
}