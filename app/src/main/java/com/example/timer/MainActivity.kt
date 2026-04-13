package com.example.timer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.timer.feature.AppNavGraph
import com.example.timer.feature.Stopwatchx
import com.example.timer.feature.Timerx
import com.example.timer.ui.theme.TimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TimerTheme {
                    val navController = rememberNavController()
                    AppNavGraph(navController)
            }
        }
    }
}

@Composable
fun TimerxScreen(navController: NavController) {
    Box {
        Button(onClick={navController.navigate(Stopwatchx)}) {Text(text="<- 스톱워치")}
        Text("타이머", color=Color(0xFF0000FF))
    }
}

@Composable
fun StandardScreen(navController: NavController) {
    Box() {
        Button(onClick={navController.navigate(Stopwatchx)}) {Text(text="시작")}
        Text("기본", color=Color(0xFF0000FF))
    }
}

@Composable
fun StopwatchxScreen(navController: NavController) {
    Box {
        Button(onClick={navController.navigate(Timerx)}) {Text(text="타이머 ->")}
        Text("스톱워치", color=Color(0xFF0000FF))
    }
}