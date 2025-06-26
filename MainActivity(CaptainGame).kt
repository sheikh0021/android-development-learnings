package com.wassha.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.wassha.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    CaptainGame()
                }
            }
        }
    }
}

@Composable
fun CaptainGame() {
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }

    Column {
        Text(text = "Treasure Found: ${treasureFound.value}")
        Text(text = "Current Direction: ${direction.value}")
        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()){
                treasureFound.value += 1
            }
        }) {
            Text("Sail East")
        }
        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()){
                treasureFound.value += 1
            }
        }) {
            Text("Sail West")
        }
        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()){
                treasureFound.value += 1
            }
        }) {
            Text("Sail North")
        }
        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()){
                treasureFound.value += 1
            }
        }) {
            Text("Sail South")
        }
    }
}

