package com.example.timer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF3D7FE8))
                .padding(13.dp)
        ) {
            Text(
                text = "타이머",
                color = Color.White,
                fontSize = 20.sp,
            )
        }
        Column{
            Box() {
                Button(
                    onClick = { navController.navigate(Stopwatchx) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Gray
                    ),
                    modifier = Modifier.width(120.dp).offset(0.dp, 0.dp)
                ) { Text(text = "<-스톱워치") }
            }
        }
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "타이머 화면 입니다",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Column{
            Box(contentAlignment = Alignment.BottomEnd, modifier=Modifier.weight(1f)){
                Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                        horizontalArrangement = Arrangement . spacedBy (12.dp)) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color(0xFF3D7FE8), RoundedCornerShape(12.dp))
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("중지", color = Color.White, fontSize = 18.sp)
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color(0xFF3D7FE8), RoundedCornerShape(12.dp))
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("시작", color = Color.White, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Composable
    fun StandardScreen(navController: NavController) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center  // ← Box 전체 중앙 정렬
        ) {
            Button(
                onClick = { navController.navigate(Stopwatchx) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(
                    text = "TIMER",
                    color = Color.Black,
                    fontSize = 50.sp
                )
                }
            }
        }

@Composable
    fun StopwatchxScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF3D7FE8))
                .padding(13.dp)
        ) {
            Text(
                text = "스톱위치",
                color = Color.White,
                fontSize = 20.sp,
            )
        }
        Column{
            Box() {
                Button(
                    onClick = { navController.navigate(Timerx) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Gray
                    ),
                    modifier = Modifier.width(120.dp).offset(300.dp, 0.dp)
                ) { Text(text = "-> 타이머") }
            }
        }
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "00:00:00",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Column{
            Box(contentAlignment = Alignment.Center){
                Button(onClick={}, modifier=Modifier.offset(x=150.dp, y=100.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Red,
                    contentColor = Color.White)) {
                    Text("초기화", modifier=Modifier, fontSize = 20.sp, fontWeight=FontWeight.Bold)
                }
            }
        }
        Column{
            Box(contentAlignment = Alignment.BottomEnd, modifier=Modifier.weight(1f)){
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                    horizontalArrangement = Arrangement . spacedBy (12.dp)) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color(0xFF3D7FE8), RoundedCornerShape(12.dp))
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("중지", color = Color.White, fontSize = 18.sp)
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color(0xFF3D7FE8), RoundedCornerShape(12.dp))
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("시작", color = Color.White, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}