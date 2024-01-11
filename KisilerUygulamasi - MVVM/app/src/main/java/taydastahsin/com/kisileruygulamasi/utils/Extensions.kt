package taydastahsin.com.kisileruygulamasi.utils

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import taydastahsin.com.kisileruygulamasi.R

fun Navigation.gecisYap(it:View,id:Int){//"Navigation" yapımızı ortak kullanabilmek için fonksiyona tanımladık ve veri istedik.
    findNavController(it).navigate(id)
}
fun Navigation.gecisYap(it:View,id:NavDirections){
    findNavController(it).navigate(id)
}