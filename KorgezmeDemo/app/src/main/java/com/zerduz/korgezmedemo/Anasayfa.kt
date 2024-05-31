package com.zerduz.korgezmedemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.size(width = 1280.dp, height = 100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly) {

            var text = remember { mutableStateOf("") }
            var activite = remember { mutableStateOf(false) }
            Text(text = "KÖRGEZME", fontSize = 36.sp, fontWeight = FontWeight.Bold)
            SearchBar(query =text.value ,
                onQueryChange ={text.value=it} ,
                onSearch ={activite.value=false} ,
                active =activite.value ,
                onActiveChange ={activite.value=it} ) {

            }
            Button(onClick = {}) {
                Text(text = "Home", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            }

        }
        Text(text = "Haberler Kısmı")


    }
}