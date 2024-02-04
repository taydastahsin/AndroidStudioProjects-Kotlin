package taydastahsin.com.todoaplication.ui.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.todoaplication.data.repo.todoRepository
import javax.inject.Inject

@HiltViewModel
class KayitViewModel @Inject constructor(var trepo:todoRepository) {

    fun kaydet(todo_baslik:String,todo_bilgi:String){
        CoroutineScope(Dispatchers.Main).launch {
            trepo.kaydet(todo_baslik,todo_bilgi)
        }
    }
}