package com.example.timer.feature

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.timer.StandardScreen
import com.example.timer.StopwatchxScreen
import com.example.timer.TimerxScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Standard
    ) {
        composable<Standard> {
            StandardScreen(navController=navController)
        }
        composable<Timerx> {
            TimerxScreen(navController=navController)
        }
        composable<Stopwatchx> {
            StopwatchxScreen(navController=navController)
        }
    }
}