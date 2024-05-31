package com.zerduz.korgezmedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun DetaySayfa(){

    Column {
        Image(painter = painterResource(id = R.drawable.image), contentDescription ="üst resim" )
        Row {
            Column {
                Text(text = "Fuar Name")
                Text(text = "Fuar Tarih")
                Text(text = "Fuar Adres")
                Text(text = "Fuar Süresi")
                Text(text = "URL")
            }
            Column {
                Text(text = "Fuar Name")
                Text(text = "Fuar Tarih")
                Text(text = "Fuar Adres")
                Text(text = "Fuar Süresi")
                Text(text = "URL")
            }
        }
        Text(text = "Açıklama")
        Text(text = "Başlık kısmı")
        Text(text = "URL")
        MapScreen()

    }

}