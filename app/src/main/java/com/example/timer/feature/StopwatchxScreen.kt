package com.example.timer.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StopwatchxScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Bluex,
                    titleContentColor = Color.White
                ), title = {
                    Text("스톱워치", color = Color.White, fontSize = 20.sp)
                }
            )
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(301.dp, 83.dp, 20.dp, 798.dp)) {
            Box {
                TextButton(
                    onClick = { navController.navigate(Timerx) },
                    modifier = Modifier.size(91.dp, 36.dp)
                ) { Text(text = "타이머->", color = Color.Gray) }
            }
        }
        Column(modifier = Modifier.padding(91.dp, 283.dp, 91.dp, 456.dp)) {
            Box(
                modifier = Modifier.size(229.dp, 78.dp),
            ) {
                Text(
                    text = "00:00:00",
                    fontSize = 52.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Box(modifier = Modifier.size(170.dp, 60.dp), contentAlignment = Alignment.Center) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = Color.Red
                    )
                ) {
                    Text(
                        text = "초기화",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row(
            modifier = Modifier.padding(26.dp, 831.dp, 26.dp, 26.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box() {
                Button(
                    onClick = {},
                    modifier = Modifier.size(170.dp, 60.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = Bluex
                    )
                ) {
                    Text(
                        text = "중지",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Box() {
                Button(
                    onClick = {},
                    modifier = Modifier.size(170.dp, 60.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = Bluex
                    )
                ) {
                    Text(
                        text = "시작",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}