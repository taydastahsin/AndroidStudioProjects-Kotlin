package com.zerduz.korgezme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun anasayfa(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.size(width = 1280.dp, height = 100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly) {

            var text = remember { mutableStateOf("")}
            var activite = remember { mutableStateOf(false)}
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


    }

}
