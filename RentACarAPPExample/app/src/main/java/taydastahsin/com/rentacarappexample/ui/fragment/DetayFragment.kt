package taydastahsin.com.rentacarappexample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import taydastahsin.com.rentacarappexample.R
import taydastahsin.com.rentacarappexample.data.Arabalar
import taydastahsin.com.rentacarappexample.data.Göstergeler
import taydastahsin.com.rentacarappexample.databinding.FragmentDetayBinding
import taydastahsin.com.rentacarappexample.ui.adapter.ArabalarAdapter
import taydastahsin.com.rentacarappexample.ui.adapter.DetayAdapter


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentDetayBinding.inflate(inflater, container, false)

        binding.recyclerView2.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)


        val detay=ArrayList<Göstergeler>()
        val a1= Göstergeler(1,"250 Km/Hz","km_resim")
        val a2= Göstergeler(2,"200 Km/Hz","km_resim")
        val a3= Göstergeler(3,"300 Km/Hz","km_resim")
        val a4= Göstergeler(4,"350 Km/Hz","km_resim")
        val a5= Göstergeler(5,"250 Km/Hz","km_resim")
        val a6= Göstergeler(6,"250 Km/Hz","km_resim")

        detay.add(a1)
        detay.add(a2)
        detay.add(a3)
        detay.add(a4)
        detay.add(a5)
        detay.add(a6)

        val detayAdapter = DetayAdapter(requireContext(),detay) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
        binding.recyclerView2.adapter =detayAdapter

        return binding.root
    }

}