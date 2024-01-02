package taydastahsin.com.rentacarappexample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import taydastahsin.com.rentacarappexample.R
import taydastahsin.com.rentacarappexample.data.Arabalar
import taydastahsin.com.rentacarappexample.data.Markalar
import taydastahsin.com.rentacarappexample.databinding.FragmentAnasayfaBinding
import taydastahsin.com.rentacarappexample.ui.adapter.ArabalarAdapter
import taydastahsin.com.rentacarappexample.ui.adapter.MarkalarAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.rvKategori.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        binding.rvMarka.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        val arabalar =ArrayList<Arabalar>()
        val a1=Arabalar(1,"Tofaş","1,5 M","a1")
        val a2=Arabalar(2,"Porshe","3 M","a2")
        val a3=Arabalar(3,"Audi","5 M","a3")
        val a4=Arabalar(4,"Mercedes","7 M","a4")
        val a5=Arabalar(5,"Kia","10 M","a5")
        val a6=Arabalar(6,"Togg","100 M","a6")

        arabalar.add(a1)
        arabalar.add(a2)
        arabalar.add(a3)
        arabalar.add(a4)
        arabalar.add(a5)
        arabalar.add(a6)

        val arabaAdapter =ArabalarAdapter(requireContext(),arabalar) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
        binding.rvKategori.adapter =arabaAdapter

        val markalar =ArrayList<Markalar>()
        val m1 =Markalar(1,"m1")
        val m2 =Markalar(2,"m2")
        val m3 =Markalar(3,"m3")
        val m4 =Markalar(4,"m4")
        val m5 =Markalar(5,"m5")

        markalar.add(m1)
        markalar.add(m2)
        markalar.add(m3)
        markalar.add(m4)
        markalar.add(m5)

        val markaAdapter =MarkalarAdapter(requireContext(),markalar) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
        binding.rvMarka.adapter =markaAdapter



        return binding.root
    }

}