package taydastahsin.com.todoaplication.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.todoaplication.data.entity.todoData
import taydastahsin.com.todoaplication.data.repo.todoRepository
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var trepo:todoRepository) :ViewModel() {
var todoListesi =MutableLiveData<List<todoData>>()

    init {
    dataGoster()
    }
    fun dataGoster(){
    CoroutineScope(Dispatchers.Main).launch {
        todoListesi.value=trepo.dataGoster()
    }

    fun bilgiAra(aramaKelimesi:String){
    CoroutineScope(Dispatchers.Main).launch {
        todoListesi.value=trepo.ara(aramaKelimesi)
    }
        

}

}
}