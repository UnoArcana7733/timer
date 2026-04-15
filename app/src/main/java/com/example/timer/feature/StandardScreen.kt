package com.example.timer.feature

import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.timer.R

val Bluex = Color(0xFF3D7FE8)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StandardScreen(navController: NavController) {
    Scaffold(
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(start=106.dp, top=270.dp, end=106.dp,bottom=375.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_timer),
                contentDescription = "Timer is timer than timer.",
                modifier=Modifier.size(200.dp)
            )
            Box(modifier=Modifier.fillMaxSize(), Alignment.Center){
                TextButton(onClick={navController.navigate(Stopwatchx)}) {
                    Text("TIMER", color=Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}