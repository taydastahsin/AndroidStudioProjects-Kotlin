package taydastahsin.com.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class  Internet @Inject constructor (var adres: Adres) {

    fun basvuru(){
        Log.e("Sonuc","Yapmış olduğunuz ${adres.adresBilgi} 'e başvurunuz onaylandı.")
    }
}