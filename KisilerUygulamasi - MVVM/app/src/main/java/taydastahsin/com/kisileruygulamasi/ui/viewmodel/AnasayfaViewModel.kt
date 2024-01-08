package taydastahsin.com.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.data.repository.KisiRepository

class AnasayfaViewModel:ViewModel() {

    val krepo =KisiRepository()
    val kisilerListesi = MutableLiveData<List<Kisiler>>()


    fun sil(kisi_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.sil(kisi_id)
        }

    }

    init {
        data()
    }

    fun data(){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value =krepo.data()
        }
    }
}