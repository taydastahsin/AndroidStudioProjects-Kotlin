package taydastahsin.com.datastorekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.datastorekullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ap= AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {
            //Veri kaydı kısmı
            ap.adKaydet("Tahsin")
            ap.soyadKaydet("Taydaş")
            ap.yasKaydet(25)
            ap.boyKaydet(1.80)
            ap.bekarKaydet(true)
            val veri =HashSet<String>()
            veri.add("Ali")
            veri.add("Veli")
            ap.listeKaydet(veri)

            //Veri silme kısmı
            //ap.adSil()
            //ap.soyadSil()
            //ap.yasSil()
            //ap.boySil()
            //ap.bekarSil()
            //ap.listeSil()

            //Veri okuma kısmı
            var gelenAd=ap.adGoster()
            var gelenSoyad=ap.soyadGoster()
            var gelenYas=ap.yasGoster()
            var gelenBoy=ap.boyGoster()
            var gelenBekar=ap.bekarGoster()

            Log.e("Sonuc",gelenAd)
            Log.e("Sonuc",gelenSoyad)
            Log.e("Sonuc", gelenYas.toString())
            Log.e("Sonuc",gelenBoy.toString())
            Log.e("Sonuc",gelenBekar.toString())





            var gelenBilgi=ap.listeGoster()
            if (gelenBilgi !=null){
                for (a in gelenBilgi){
                    Log.e("Sonuc",a)
                }
            }
        }
    }
}