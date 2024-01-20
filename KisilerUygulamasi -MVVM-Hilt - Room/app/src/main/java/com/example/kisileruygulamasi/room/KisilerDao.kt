package com.example.kisileruygulamasi.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.kisileruygulamasi.data.entity.Kisiler

@Dao
interface KisilerDao {
    @Query("SELECT * FROM kisiler")
    suspend fun dataGoster(): List<Kisiler>

    @Insert
    suspend fun dataKaydet(kisi:Kisiler)

    @Update
    suspend fun dataGuncelle(kisi:Kisiler)

    @Delete
    suspend fun dataSil(kisi:Kisiler)

    @Query("SELECT * FROM kisiler WHERE kisi_ad like '%'||:aramaKelimesi ||'%'")
    suspend fun ara(aramaKelimesi:String): List<Kisiler>
}