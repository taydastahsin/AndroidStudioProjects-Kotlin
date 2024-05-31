package com.zerduz.jetpackdemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun SayfaGecis(){
    val navContraller = rememberNavController()
    NavHost(navController = navContraller, startDestination ="anasayfa" ) {

        composable("anasayfa"){
            Anasayfa(navContraller)
        }

        composable("tahmin_ekrani"){

            TahminEt(navContraller)
        }

        composable("tahmin_sonuc/{sonuc}",arguments= listOf(
            navArgument("sonuc"){type= NavType.BoolType}
        )){
            val sonuc = it.arguments?.getBoolean("sonuc")!!
            TahminSonuc(navContraller,sonuc)
        }

    }
}