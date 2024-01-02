package taydastahsin.com.rentacarappexample.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import taydastahsin.com.rentacarappexample.data.Arabalar
import taydastahsin.com.rentacarappexample.data.Göstergeler
import taydastahsin.com.rentacarappexample.databinding.CardTasarim3Binding

class DetayAdapter(var mcontext: Context, var gostergeListesi:List<Göstergeler>)
    :RecyclerView.Adapter<DetayAdapter.CardTutucuTasarim>(){

    inner  class CardTutucuTasarim(var tasarim:CardTasarim3Binding) :RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTutucuTasarim {
        val  binding = CardTasarim3Binding.inflate(LayoutInflater.from(mcontext), parent, false)
        return CardTutucuTasarim(binding)
    }


    override fun onBindViewHolder(holder: CardTutucuTasarim, position: Int) {
        val gostergelist =gostergeListesi.get(position)
        val t =holder.tasarim

        t.imageView4.setImageResource(mcontext.resources.getIdentifier(gostergelist.car_photo,"drawable",mcontext.packageName))
        t.textView2.text="${gostergelist.car_bilgi}"
    }

    override fun getItemCount(): Int {
        return gostergeListesi.size
    }

}