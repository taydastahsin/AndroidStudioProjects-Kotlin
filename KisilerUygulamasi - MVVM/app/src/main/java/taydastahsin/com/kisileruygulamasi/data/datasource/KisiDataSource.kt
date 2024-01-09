package taydastahsin.com.kisileruygulamasi.data.datasource

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler

class KisiDataSource {

    suspend fun buttonkaydet(kisiAd : String,kisiTel :String){
        Log.e("Kişiler Kaydet","$kisiAd - $kisiTel")

    }

   suspend fun  buttonguncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String){

        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun sil(kisi_id:Int){

        Log.e("Kişiler Sil","${kisi_id.toString()}")
    }

    suspend fun data():List<Kisiler> = withContext(Dispatchers.IO) {
        val veriList = ArrayList<Kisiler>()

        var k1 = Kisiler(1,"Tahsin","05392546511")
        var k2 = Kisiler(2,"Gözde","Kalbimin numarası")
        var k3 = Kisiler(3,"Sevgi","İsteyen herkes ulaşabilir")

        veriList.add(k1)
        veriList.add(k2)
        veriList.add(k3)

        return@withContext veriList

    }
    suspend fun ara(girilenbilgi : String):List<Kisiler> = withContext(Dispatchers.IO) {
        val veriList = ArrayList<Kisiler>()

        var k1 = Kisiler(1,"Tahsin","05392546511")
        veriList.add(k1)

        return@withContext veriList

    }
}