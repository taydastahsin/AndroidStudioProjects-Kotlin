package taydastahsin.com.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import taydastahsin.com.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding//Main Layout'unda bulunan araçlara erişim sağlamak için kurdum.
    private val viewModel:MainActivityViewModel by viewModels()//"viewModel" yapımızı anasayfamızda tanımladım.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(LayoutInflater.from(this))//Binding yapısını anasayfaya entegre ettim.
        setContentView(binding.root)

       viewModel.sonuc.observe(this){//"ViewModel" yapısında "liveData" türünde dönüşümü tanımlamak için "observe" kullandım.
           binding.textSonuc=it//ekranda sonucu göstermek için "it" belirten "observe" den aldım.
       }
        binding.mainActivityNesnesi=this//"DataBinding" yapısında "xml" kodlarının nerde aktif hale geldiğini belirttim.


    }

    fun buttonToplamaTikla( sayi1Deger:String,sayi2Deger:String ){//İşlemlerimizde kullancağımız fonksiyonları tanımladım.
        viewModel.ToplamaYap(sayi1Deger,sayi2Deger)//Yapılcak işlemin "viewModel" e göndererek yapılmasını sağladım.
    }

    fun buttonCarpmaTikla(sayi1Deger:String,sayi2Deger:String){//İşlemlerimizde kullancağımız fonksiyonları tanımladım.
       viewModel.CarpmaYap(sayi1Deger,sayi2Deger)//Yapılcak işlemin "viewModel" e göndererek yapılmasını sağladım.

    }
}