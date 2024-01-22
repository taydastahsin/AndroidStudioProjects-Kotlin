package taydastahsin.com.glidkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import taydastahsin.com.glidkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resimGoster("kadayıf.png")


        binding.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }

        binding.buttonResim2.setOnClickListener {
            resimGoster("su.png")
        }


    }
    fun resimGoster(resim:String){
        val url="http://kasimadalan.pe.hu/yemekler/resimler/$resim"
        Glide.with(this).load(url).override(300,300).into(binding.imageView)

    }
}