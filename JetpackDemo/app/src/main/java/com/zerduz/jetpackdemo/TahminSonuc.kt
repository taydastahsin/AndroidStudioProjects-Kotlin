package com.zerduz.jetpackdemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TahminSonuc(navController: NavController,gelenSonuc :Boolean){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {

        if (gelenSonuc){
            Text(text = "Kazandınız", fontSize = 36.sp, fontWeight = FontWeight.Bold)
            Image(painter = painterResource(id = R.drawable.true_resim), contentDescription ="",Modifier.size(150.dp) )
        }
        else
        {
            Text(text = "Kaybettiniz", fontSize = 36.sp, fontWeight = FontWeight.Bold)
            Image(painter = painterResource(id = R.drawable.false_resim), contentDescription ="",Modifier.size(150.dp) )
        }

        

    }


}