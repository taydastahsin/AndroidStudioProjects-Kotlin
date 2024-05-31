package com.zerduz.jetpackdemo

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.random.Random

@Composable
fun TahminEt(navController: NavController){
    val tahmin = remember { mutableStateOf("") }
    val kalanHak = remember { mutableStateOf(5) }
    val yonlendirme = remember { mutableStateOf("")}
    val rastSayi = remember { mutableStateOf(0)}

    LaunchedEffect(key1 = true) {
        rastSayi.value = Random.nextInt(101)
        Log.e("Rastgele Sayı :",rastSayi.value.toString())

    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) 
    {
        Text(text = "Kalan Hak : ${kalanHak.value}", fontSize = 36.sp ,fontWeight = FontWeight.Bold)

        Text(text = "Yardım : ${yonlendirme.value}", fontSize = 36.sp, fontWeight = FontWeight.Bold)

        TextField(value =tahmin.value,
            onValueChange = {tahmin.value=it},
            label = { Text(text = "Tahmin Sayısı", fontSize = 25.sp)})

        Button(onClick = {
            kalanHak.value=kalanHak.value-1
            if (tahmin.value.toInt()==rastSayi.value){
                navController.navigate("tahmin_sonuc/true"){
                    popUpTo("tahmin_ekrani"){inclusive=true}
                }
                return@Button

            }
            if (tahmin.value.toInt()<rastSayi.value){
                yonlendirme.value="Artır"
            }
            if (tahmin.value.toInt()>rastSayi.value){
                yonlendirme.value="Azalt"
            }
            if (kalanHak.value.toInt()==0){
                navController.navigate("tahmin_sonuc/false"){
                    popUpTo("tahmin_ekrani"){inclusive=true}
                }

            }

            tahmin.value=""
        }) {
            Text(text = "Tahmin Et", fontSize =36.sp)

        }
        
    }
}