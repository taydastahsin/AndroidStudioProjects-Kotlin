package com.example.kisileruygulamasi.data.datasource

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var collectionKisiler: CollectionReference) {

    var kisilerListesi = MutableLiveData<List<Kisiler>>()

     fun kisileriYukle() : MutableLiveData<List<Kisiler>> {
         collectionKisiler.addSnapshotListener { value, error ->
             if (value != null){
                 val liste =ArrayList<Kisiler>()
                 for (d in value.documents){
                     val kisi =d.toObject(Kisiler::class.java)
                     if (kisi != null){
                         kisi.kisi_id = d.id
                         liste.add(kisi)
                     }
                 }
                 kisilerListesi.value=liste
             }
         }

            return kisilerListesi
        }

    fun ara(aramaKelimesi:String): MutableLiveData<List<Kisiler>> {
        collectionKisiler.addSnapshotListener { value, error ->
            if (value != null){
                val liste =ArrayList<Kisiler>()
                for (d in value.documents){
                    val kisi =d.toObject(Kisiler::class.java)
                    if (kisi != null){
                       if (kisi.kisi_ad !!.lowercase().contains(aramaKelimesi.lowercase())){
                           kisi.kisi_id = d.id
                           liste.add(kisi)
                       }
                    }
                }
                kisilerListesi.value=liste
            }
        }

        return kisilerListesi
        }

    fun kaydet(kisi_ad:String,kisi_tel:String){
        var yeniKisi =Kisiler("",kisi_ad,kisi_tel)
        collectionKisiler.document().set(yeniKisi)
    }

     fun guncelle(kisi_id:String,kisi_ad:String,kisi_tel:String){
         val guncelKisi = HashMap <String,Any> ()
         guncelKisi["kisi_ad"]=kisi_ad
         guncelKisi["kisi_tel"]=kisi_tel
        collectionKisiler.document(kisi_id).update(guncelKisi)
    }

    fun sil(kisi_id:String){
        collectionKisiler.document(kisi_id).delete()
    }
}