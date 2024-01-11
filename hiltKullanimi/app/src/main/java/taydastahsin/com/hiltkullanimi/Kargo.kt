package taydastahsin.com.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor (var adres: Adres){


    fun gonderi(){
        Log.e("Sonuc","${adres.adresBilgi} 'a gönderi gelmiştir.")
    }
}