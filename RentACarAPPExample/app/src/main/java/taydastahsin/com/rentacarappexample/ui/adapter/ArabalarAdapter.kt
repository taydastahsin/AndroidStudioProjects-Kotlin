package taydastahsin.com.rentacarappexample.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import taydastahsin.com.rentacarappexample.data.Arabalar
import taydastahsin.com.rentacarappexample.data.Göstergeler
import taydastahsin.com.rentacarappexample.databinding.CardTasarimBinding
import taydastahsin.com.rentacarappexample.databinding.FragmentAnasayfaBinding
import taydastahsin.com.rentacarappexample.ui.fragment.AnasayfaFragmentDirections

class ArabalarAdapter(var mcontext:Context,var arabaListesi:List<Arabalar>)
    :RecyclerView.Adapter<ArabalarAdapter.CardTasarimTutucu>(){

    inner class  CardTasarimTutucu (var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val  binding = CardTasarimBinding.inflate(LayoutInflater.from(mcontext), parent, false)
        return CardTasarimTutucu(binding)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val arabalist =arabaListesi.get(position)
        val t =holder.tasarim

        t.imageView.setImageResource(mcontext.resources.getIdentifier(arabalist.car_photo,"drawable",mcontext.packageName))
        t.textVEwArabaAd.text="${arabalist.car_name}"
        t.textViewArabaFiyat.text="${arabalist.car_sell} Dolar"

        t.imageView.setOnClickListener {
            val gecis =AnasayfaFragmentDirections.anasayfaDetayGecis(arabalar = arabalist)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return arabaListesi.size
    }

}