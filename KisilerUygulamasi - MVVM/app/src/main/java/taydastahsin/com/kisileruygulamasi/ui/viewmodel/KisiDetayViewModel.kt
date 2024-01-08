package taydastahsin.com.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.kisileruygulamasi.data.repository.KisiRepository

class KisiDetayViewModel:ViewModel() {
    val krep =KisiRepository()

    fun  buttonguncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch {
            krep.buttonguncelle(kisi_id,kisi_ad,kisi_tel)
        }
    }

}