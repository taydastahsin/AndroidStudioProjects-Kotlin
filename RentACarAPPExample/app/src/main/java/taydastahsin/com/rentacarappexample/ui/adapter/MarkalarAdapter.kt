package taydastahsin.com.rentacarappexample.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import taydastahsin.com.rentacarappexample.data.Markalar
import taydastahsin.com.rentacarappexample.databinding.CardTasarim2Binding
import taydastahsin.com.rentacarappexample.databinding.CardTasarim3Binding

class MarkalarAdapter(var mcontext:Context,var markalarListesi:List<Markalar>)
    :RecyclerView.Adapter<MarkalarAdapter.CardTutucuTasarim>(){

    inner class CardTutucuTasarim(var tasarim:CardTasarim2Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTutucuTasarim {
        val  binding = CardTasarim2Binding.inflate(LayoutInflater.from(mcontext), parent, false)
        return CardTutucuTasarim(binding)
    }


    override fun onBindViewHolder(holder: CardTutucuTasarim, position: Int) {
        val markalist=markalarListesi.get(position)
        val t =holder.tasarim

        t.imageView2.setImageResource(mcontext.resources.getIdentifier(markalist.m_photo,"drawable",mcontext.packageName))


    }

    override fun getItemCount(): Int {
        return markalarListesi.size
    }
}