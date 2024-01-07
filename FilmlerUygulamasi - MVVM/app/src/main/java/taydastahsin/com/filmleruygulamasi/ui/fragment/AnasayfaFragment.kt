package taydastahsin.com.filmleruygulamasi.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import taydastahsin.com.filmleruygulamasi.R
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler
import taydastahsin.com.filmleruygulamasi.databinding.FragmentAnasayfaBinding
import taydastahsin.com.filmleruygulamasi.ui.adapter.FilmlerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding //Anasayfa fragment araçları kullanmak için tanımladığımız yöntem

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false) //"bindding" yapısına fragment'i entegre ettik

        binding.toolbar.title="Filmler" //Toolbar'ımıza başlık tanımladık.

        //Fragment'ımızın içinde bulunan "RecyclerView" yapısının arayüzünü tasarladık
        binding.rcy.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val filmlerListesi = ArrayList<Filmler>() //Kullancağımız verileri dizi şeklinde tanımladık.
        val f1 = Filmler(1,"Django","django",24)
        val f2 = Filmler(2,"Interstellar","interstellar",32)
        val f3 = Filmler(3,"Inception","inception",16)
        val f4 = Filmler(4,"The Hateful Eight","thehatefuleight",28)
        val f5 = Filmler(5,"The Pianist","thepianist",18)
        val f6 = Filmler(6,"Anadoluda","anadoluda",10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val filmAdapter = FilmlerAdapter(requireContext(),filmlerListesi) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
        binding.rcy.adapter =filmAdapter

        return binding.root
    }

}