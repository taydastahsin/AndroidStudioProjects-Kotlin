package taydastahsin.com.maincalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.maincalismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //Kütüphane olarak kurduğumuz "binding" "Main Active" bağladık
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =ActivityMainBinding.inflate(layoutInflater) //Main activeden görsellerine erişim sağlamamıza yaradı
        setContentView(binding.root)

      //  binding.textViewHome.text="Merhaba Tahsin Bey" //Ana Ekran açılınca yazıyı yazdırtıyor
       binding.buttonGec.setOnClickListener{ //Butona tıklandığında kısa mesaj gönderiyor
       //     Snackbar.make(it,"Butona Bastınız",Snackbar.LENGTH_SHORT).show()
           val intent = Intent(this@MainActivity,MainActivity2::class.java)

           intent.putExtra("ad","Gözde Nur ")
           intent.putExtra("soyad","Ayvar")
           intent.putExtra("yas",19)

           startActivity(intent)
       }



    }
}