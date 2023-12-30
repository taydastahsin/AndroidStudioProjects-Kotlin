package taydastahsin.com.filmleruygulamasi.ui.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler
import taydastahsin.com.filmleruygulamasi.databinding.CardTasarimBinding

class FilmlerAdapter(var mcontext :Context,var filmListesi:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.cardTasarim>() {

    inner class cardTasarim(var tasarim :CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarim {
        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: cardTasarim, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return filmListesi.size
    }
}