package com.example.kisileruygulamasi.data.datasource

import android.content.Context
import android.util.Log
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.room.KisilerDao
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.internal.Contexts
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kdao:KisilerDao) {

    suspend fun kisileriYukle() : List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kdao.dataGoster()
        }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kdao.ara(aramaKelimesi)
        }

    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        val yeniKisi =Kisiler(0,kisi_ad,kisi_tel)
        kdao.dataKaydet(yeniKisi)
    }

    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        val kisiGuncel = Kisiler(kisi_id,kisi_ad,kisi_tel)
        kdao.dataGuncelle(kisiGuncel)

    }

    suspend fun sil(kisi_id:Int){
        val kisiSil= Kisiler(kisi_id,"","")
        kdao.dataSil(kisiSil)
    }
}