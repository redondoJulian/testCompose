package com.example.pruebacompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxColumnText() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 13.dp)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier.background(color = Color.LightGray)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 34.dp)
            ) {
                Text(text = "¡Hola!", color = Color.Red)
                Text(text = "¿Como...")
                Text(text = "...Estás?")
            }
        }
    }
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 13.dp)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier.background(color = Color.LightGray)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 34.dp)
            ) {
                Text(text = "¡Hola!", color = Color.Red)
                Text(text = "¿Como...")
                Text(text = "...Estás?")
            }
        }
    }
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 13.dp)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier.background(color = Color.LightGray)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 34.dp)
            ) {
                Text(text = "¡Hola!", color = Color.Red)
                Text(text = "¿Como...")
                Text(text = "...Estás?")
            }
        }
    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 13.dp)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier.background(color = Color.LightGray)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 34.dp)
            ) {
                Text(text = "¡Hola!", color = Color.Red)
                Text(text = "¿Como...")
                Text(text = "...Estás?")
            }
        }
    }
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 13.dp)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier.background(color = Color.LightGray)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 34.dp)
            ) {
                Text(text = "¡Hola!", color = Color.Red)
                Text(text = "¿Como...")
                Text(text = "...Estás?")
            }
        }
    }
}