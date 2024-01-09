package taydastahsin.com.kisileruygulamasi.data.repository

import taydastahsin.com.kisileruygulamasi.data.datasource.KisiDataSource
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler

class KisiRepository {
    val kds =KisiDataSource()

    suspend fun buttonkaydet(kisiAd : String,kisiTel :String) =kds.buttonkaydet(kisiAd,kisiTel)

    suspend fun  buttonguncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String)=kds.buttonguncelle(kisi_id,kisi_ad,kisi_tel)

    suspend fun sil(kisi_id:Int)=kds.sil(kisi_id)

    suspend fun data():List<Kisiler> =kds.data()

    suspend fun ara(girilenbilgi : String):List<Kisiler> =kds.ara(girilenbilgi)
}