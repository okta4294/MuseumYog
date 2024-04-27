package com.example.museumyog

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.museumyog.ui.theme.MuseumYogTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class splashScreen: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            MuseumYogTheme {
                splash()
            }
        }
    }
}
@Preview
@Composable
private fun splash(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription ="Logo apps",
            modifier = Modifier.size(230.dp))
    }
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter){
        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "CopyRight By Swakarya 2024")
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Version 1.0.0")
            Spacer(modifier = Modifier.height(8.dp))

        }
    }


}