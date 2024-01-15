package taydastahsin.com.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.kisileruygulamasi.data.repository.KisiRepository

class KisiKayitViewModel:ViewModel() {
    val krepo =KisiRepository()

    fun buttonkaydet(kisiAd : String,kisiTel :String){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.buttonkaydet(kisiAd,kisiTel)
        }
    }

}