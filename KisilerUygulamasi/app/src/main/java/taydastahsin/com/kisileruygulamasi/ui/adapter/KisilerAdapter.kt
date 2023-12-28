package taydastahsin.com.kisileruygulamasi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.databinding.CardTasarimBinding
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiDetayBinding

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
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {//Yaptığımız liste görünümden kaç adet olduğunu "List" yapısının içeresindeki veri sayısına eşitledik.
        return kisilerListesi.size
    }


}