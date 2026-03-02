package com.aphamogged.telaexercicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aphamogged.telaexercicio.ui.theme.TelaExercicioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaExercicioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                GameOver(modifier = Modifier.padding(innerPadding)
                )
                }
            }
        }
    }
}

@Composable
fun GameOver(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        Alignment.Center,

    )
    {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            colorFilter = ColorFilter.tint(Color(76, 175, 80, 255)),
            contentDescription = "Android enemy"



        )
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            colorFilter = ColorFilter.tint(Color(215, 18, 80, 255)),
            contentDescription = "Android enemy"


        )
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            colorFilter = ColorFilter.tint(Color(30, 57, 233, 255)),
            contentDescription = "Android enemy",


            )
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            colorFilter = ColorFilter.tint(Color(185, 201, 36, 255)),
            contentDescription = "Android enemy",


            )
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            colorFilter = ColorFilter.tint(Color(152, 234, 17, 255)),
            contentDescription = "Android enemy"

        )
    }
        Text(
            text ="GAME OVER",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 65.sp
        )
}}
