package com.example.pruebacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
//import com.example.pruebacompose.layout.BoxColumnText
import com.example.pruebacompose.layout.ScaffoldLayout
import com.example.pruebacompose.layout.ScaffoldLayout1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldLayout1()
        }
    }
}