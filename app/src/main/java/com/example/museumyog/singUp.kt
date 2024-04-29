package com.example.museumyog

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.compose.rememberNavController
import com.example.museumyog.ui.theme.MuseumYogTheme
import com.example.museumyog.ui.theme.coklatku
import com.example.museumyog.ui.theme.greenku
import com.example.museumyog.ui.theme.greyku
import com.example.museumyog.ui.theme.worksans
import com.example.museumyog.ui.theme.worksansbold


@SuppressLint("CustomSplashScreen")
class singup: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            MuseumYogTheme {
                singUp()
            }
        }
    }
}
@Composable
fun Fullname() {
    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        modifier = Modifier
            .size(width = 350.dp, height = 60.dp)
            .border(
                BorderStroke(width = 3.dp, color = greyku),
                shape = RoundedCornerShape(20)
            ),
        onValueChange = { name = it },
        placeholder = { Text(text = "Username") }
    )
}
@Preview
@Composable
private fun singUp(){
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopCenter){
        Image(painter = painterResource(id = R.drawable.perempuan_dan_background),
            contentDescription =null ,
            modifier = Modifier
                .size(500.dp)
                .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 150.dp))
    }
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopStart) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Spacer(modifier = Modifier.width(20.dp))
                Image(painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo")
            }
        }
    }
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopEnd){
        Column {
            Image(painter = painterResource(id = R.drawable.awan3),
                contentDescription =null,
                modifier = Modifier.size(130.dp))
        }
    }
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopCenter){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(330.dp))
            Text(text = "Daftar Sekarang!",
                color = coklatku,
                fontFamily = worksansbold,
                fontSize = 30.sp)
            Text(text = "Dapatkan pengalaman lebih seru bersama kami!",
                color= Color.Black,
                fontFamily = worksans,
                fontSize = 15.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Fullname()
            Spacer(modifier = Modifier.height(10.dp))
            FieldUsername()
            Spacer(modifier = Modifier.height(10.dp))
            FieldPassword()
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(greenku),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 350.dp, height = 60.dp))
            {
                Text(text = "Masuk")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Atau daftar dengan")
        }
    }
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopCenter){
        Column {
            Spacer(modifier = Modifier.height(690.dp))
            Row(verticalAlignment = Alignment.Top) {
                TextButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.google),
                        contentDescription =null,
                        modifier = Modifier
                            .size(150.dp))
                }
                Spacer(modifier = Modifier.width(10.dp))
                TextButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.facebook),
                        contentDescription =null ,
                        modifier = Modifier
                            .size(150.dp))
                }
            }
        }
    }
    Box(modifier = Modifier.fillMaxSize(),
        Alignment.TopCenter){
        Column {
            Spacer(modifier = Modifier.height(790.dp))
            Row (verticalAlignment = Alignment.CenterVertically){
                Text(text = "Sudah punya akun?")
                TextButton(onClick = { }) {
                    Text(text = "Masuk",
                        color = greenku,
                        textDecoration = TextDecoration.Underline)
                }
            }
        }
    }
}


