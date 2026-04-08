package com.example.timer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import appNavController.Stopwatch
import com.example.timer.ui.theme.TimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TimerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    starting(
                        modifier = Modifier.padding(innerPadding)
                    )
                    toStopWatch {  }
                }
            }
        }
    }
}

@Composable
fun starting(modifier: Modifier = Modifier) {
    Text(
        text = "Timer",
        modifier = modifier
            .fillMaxWidth()
    )
}

@Composable
fun toStopWatch(onClick: () -> Unit) {
    Button(onClick = { composable<Stopwatch> }) {
        Text(text = "toStopWatch")
    }
}