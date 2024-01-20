package taydastahsin.com.maincalismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import taydastahsin.com.maincalismayapisi.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        var gelenAd = intent.getStringExtra("ad")
        var gelenSoyad = intent.getStringExtra("soyad")
        var gelenYas = intent.getIntExtra("yas",0)

        binding.textView.text="$gelenAd $gelenSoyad $gelenYas"




    }
}