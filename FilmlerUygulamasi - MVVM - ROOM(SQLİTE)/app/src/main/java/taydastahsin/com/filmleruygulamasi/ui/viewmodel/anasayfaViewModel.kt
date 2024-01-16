package taydastahsin.com.filmleruygulamasi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler
import taydastahsin.com.filmleruygulamasi.data.repository.filmlerRepository

class anasayfaViewModel:ViewModel() {

    var frepo =filmlerRepository()
    var filmNesnesi =MutableLiveData<List<Filmler>>()

    init {
        dataGet()
    }

    fun dataGet(){
        CoroutineScope(Dispatchers.Main).launch {
           filmNesnesi.value= frepo.dataGet()
        }
    }
}