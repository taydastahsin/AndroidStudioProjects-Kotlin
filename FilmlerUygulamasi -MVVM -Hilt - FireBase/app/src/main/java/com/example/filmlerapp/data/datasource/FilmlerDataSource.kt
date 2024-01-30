package com.example.filmlerapp.data.datasource

import androidx.lifecycle.MutableLiveData
import com.example.filmlerapp.data.entity.Filmler
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var collectionFilmler: CollectionReference) {
     fun filmleriYukle() : MutableLiveData<List<Filmler>>{
         val filmlerListesi =MutableLiveData<List<Filmler>>()

         collectionFilmler.get().addOnCompleteListener {
             val veriListesi =ArrayList<Filmler>()
             for (d in it.result){
                 val film =d.toObject(Filmler::class.java)
                 film.id=d.id
                 veriListesi.add(film)
             }
             filmlerListesi.value=veriListesi
         }

         return filmlerListesi
        }
}