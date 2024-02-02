package taydastahsin.com.todoaplication.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import taydastahsin.com.todoaplication.data.entity.todoData
import taydastahsin.com.todoaplication.databinding.CardTasarimBinding

class todoAdapter(var mcontext:Context,var todoListesi:List<todoData>):RecyclerView.Adapter<todoAdapter.cardTasarim>() {
    inner class cardTasarim (var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarim {
        var binding = CardTasarimBinding.inflate(LayoutInflater.from(mcontext),parent,false)
        return  cardTasarim(binding)
    }


    override fun onBindViewHolder(holder: cardTasarim, position: Int) {
        val todo =todoListesi.get(position)//Gelen veriyi tutuyor
        val t =holder.tasarim//Ekrandaki araçları kontrol ediyor.

    }


    override fun getItemCount(): Int {
        return todoListesi.size
    }


}