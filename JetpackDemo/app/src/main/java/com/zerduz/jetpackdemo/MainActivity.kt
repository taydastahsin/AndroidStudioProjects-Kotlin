package com.zerduz.jetpackdemo

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.zerduz.jetpackdemo.ui.theme.JetpackDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SayfaGecis()
                }
            }
        }
    }
}

@Composable
fun Anasayfa(navController: NavController) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Tahmin Similasyonu", fontSize = 36.sp, fontWeight = FontWeight.Bold)
        Image(painter = painterResource(id = R.drawable.zar_resim),
            contentDescription ="Zar Resim",
            Modifier.size(150.dp))
        Button(onClick = {navController.navigate("tahmin_ekrani")}) {
            Text(text = "Oyuna Başla", fontSize = 26.sp)

        }

    }
    
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackDemoTheme {
    }
}