package taydastahsin.com.kisileruygulamasi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.databinding.CardTasarimBinding
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import taydastahsin.com.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections

class KisilerAdapter(var mcontext :Context,var kisilerListesi :List<Kisiler>) :RecyclerView.Adapter<KisilerAdapter.cardTasarim>() {
    //"mcontext" bize fragment içinde olduğumuzu belirtmek için istiyoruz.
    //"kisilerListesi" bir "List" yapısıyla gelen veriyi tutucak.
    inner class cardTasarim (var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)//Binding yapısını oluşturuyoruz.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarim {//Binding yapısını kullanabilmek için "fragment" içinde yaptığımız gibi tanıtıyoruz.
       var binding = CardTasarimBinding.inflate(LayoutInflater.from(mcontext), parent, false)
        //"LayoutInflater.from(mcontext)" ile hangi fragment içinde olduğumuzu gösteriyoruz.
        //"parent" fragment tasarımını belirttik.
        return cardTasarim(binding)
    }


    override fun onBindViewHolder(holder: cardTasarim, position: Int) {

        val kisi =kisilerListesi.get(position)
        val t = holder.tasarim //Fragment'ın "binding" yapısını "t" ye atatadık ve fragmentın içindeki "Palette"(araçlara) lere eriştik

        t.textViewAd.text =kisi.kisi_ad
        t.textViewTel.text =kisi.kisi_tel

        t.cardView.setOnClickListener {
            val gecis =AnasayfaFragmentDirections.anasayfaDetayGecis(kisi = kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.imageViewSil.setOnClickListener {//Silme işlemi için resme tıklandığında aktif hale getirdik.
            Snackbar.make(it,"${kisi.kisi_ad}Silmek istiyormusunuz ?",Snackbar.LENGTH_LONG)
                .setAction("Evet"){
                    sil(kisi.kisi_id)
                }
                .show()

        }

    }

    override fun getItemCount(): Int {//Yaptığımız liste görünümden kaç adet olduğunu "List" yapısının içeresindeki veri sayısına eşitledik.
        return kisilerListesi.size
    }

    fun sil(kisi_id:Int){

        Log.e("Kişiler Sil","${kisi_id.toString()}")
    }


}