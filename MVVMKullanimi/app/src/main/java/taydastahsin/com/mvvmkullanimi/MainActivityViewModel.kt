package taydastahsin.com.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel:ViewModel() {

    var sonuc=MutableLiveData("0") //"LiveData" oluşumunda "MutableLiveData" kullanarak "MainActivity" veri gönderimi sağladım.Burda "value" değerinde değer tutuyor.
    var matRes =MatematikRepository() //"DataSource" da yaptırdığımız işlemleri "Repository" de çalıştırma yetkisi verdiğimiz için burda "Repository" tanımladım.

    fun ToplamaYap( sayi1Deger:String,sayi2Deger:String ){//"MainActivity" de yapıcağımız fonksiyonun içindeki işlemi burda tanımladım.
        CoroutineScope(Dispatchers.Main).launch{//"DataSource" içinde kullandığımız "Coroutine " yapısını burda veri çekmek için kullandım.
            sonuc.value=matRes.ToplamaYap(sayi1Deger,sayi2Deger)//Yukarda tanımaldığımız "MatematikRepository" sınıfında bilidiğimiz gibi "MatematikDataSource" daki işleri kontrol
            //ettiği için bağlamıştık ,bu bağlamda bize işlemi yapıp geri dönüş sağlayıp değeri "sonuc" değişkenine aktardık.
        }

    }

    fun CarpmaYap(sayi1Deger:String,sayi2Deger:String){//"MainActivity" de yapıcağımız fonksiyonun içindeki işlemi burda tanımladım.
        CoroutineScope(Dispatchers.Main).launch{//"DataSource" içinde kullandığımız "Coroutine " yapısını burda veri çekmek için kullandım.
            sonuc.value=matRes.CarpmaYap(sayi1Deger,sayi2Deger)//Yukarda tanımaldığımız "MatematikRepository" sınıfında bilidiğimiz gibi "MatematikDataSource" daki işleri kontrol
            //ettiği için bağlamıştık ,bu bağlamda bize işlemi yapıp geri dönüş sağlayıp değeri "sonuc" değişkenine aktardık.
        }
    }
}