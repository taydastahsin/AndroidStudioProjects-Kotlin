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

        binding.buttonToplama.setOnClickListener {
            val sayi1Deger =binding.editTextSayi1.text.toString()
            val sayi2Deger =binding.editTextSayi2.text.toString()

            val sayi1=sayi1Deger.toInt()
            val sayi2 =sayi2Deger.toInt()

            val toplama=sayi1+sayi2

            binding.textViewSonuc.setText(toplama.toString())
        }

        binding.buttonCarpma.setOnClickListener {
            val sayi1Deger =binding.editTextSayi1.text.toString()
            val sayi2Deger =binding.editTextSayi2.text.toString()

            val sayi1=sayi1Deger.toInt()
            val sayi2 =sayi2Deger.toInt()

            val carpma=sayi1*sayi2

            binding.textViewSonuc.setText(carpma.toString())

        }


    }
}