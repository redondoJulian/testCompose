package com.example.pruebacompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout1(){
    var contador by remember { mutableStateOf(0)}
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = "Prueba: $contador",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)},
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.LightGray))
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {contador++},
                contentColor = Color.Gray,
                containerColor = Color.White,
                shape = CircleShape)
            {Text(text = "+", fontSize = 24.sp, fontWeight = FontWeight.Bold)}
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.DarkGray)){
            Column(modifier = Modifier.padding(vertical = 15.dp)) {
                    ItemContact(name = "Julian", numberPhone = "1160476402")
                    ItemContact(name = "Test", numberPhone = "1160476652")
                    ItemContact(name = "Test2", numberPhone = "1160476452")
                    ItemContact(name = "Test3", numberPhone = "1160476202")
            }
        }
    }
}