package com.example.timer.feature

import android.R.attr.fontWeight
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun TimerxScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Bluex,
                    titleContentColor = Color.White
                ), title = {
                    Text("타이머", color = Color.White, fontSize = 20.sp)
                }
            )
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(20.dp, 83.dp, 301.dp, 798.dp)) {
            Box {
                TextButton(
                    onClick = { navController.navigate(Stopwatchx) },
                    modifier = Modifier.size(117.dp, 36.dp)
                ) { Text(text = "<-스톱워치", color = Color.Gray) }
            }
        }
        Column(modifier = Modifier.padding(71.dp, 300.dp, 71.dp, 563.dp)) {
            Box(
                modifier = Modifier.size(270.dp, 54.dp),
            ) {
                Text(
                    text = "타이머 화면 입니다",
                    fontSize = 36.sp
                )
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