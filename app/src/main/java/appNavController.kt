package appNavController

import android.*
import android.annotation.SuppressLint
import androidx.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import Stopwatch.*
import StandardUI.*
import Timer.*

@Serializable
object Stopwatch
@Serializable
object Timer

@get:SuppressLint("StaticFieldLeak")
val navController: NavHostController
    @Composable
    get() = rememberNavController()

NavHost(navController=navController, startDestination=standardUI)  {
        composable<Stopwatch> { StopwatchScreen }
        composable<Timer> { TimerScreen }
    }
}