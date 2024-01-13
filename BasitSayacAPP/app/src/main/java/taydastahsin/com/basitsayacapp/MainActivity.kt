package taydastahsin.com.basitsayacapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.basitsayacapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ap =AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {

            var gelenVeri =ap.sayacGoster()

            ap.sayacKaydet(++gelenVeri)

            binding.textBilgi.text="Açılış Sayısı :${gelenVeri}"
        }




    }
}