package taydastahsin.com.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import taydastahsin.com.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.textSonuc="0"
        binding.mainActivityNesnesi=this
    }

    fun buttonToplamaTikla( sayi1Deger:String,sayi2Deger:String ){
        val sayi1=sayi1Deger.toInt()
        val sayi2 =sayi2Deger.toInt()

        val toplama=sayi1+sayi2

        binding.textSonuc=toplama.toString()
    }

    fun buttonCarpmaTikla(sayi1Deger:String,sayi2Deger:String){
        val sayi1=sayi1Deger.toInt()
        val sayi2 =sayi2Deger.toInt()

        val carpma=sayi1*sayi2

        binding.textSonuc =carpma.toString()
    }
}