package taydastahsin.com.rentacarappexample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar
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

        binding.recyclerView2.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val bundle:DetayFragmentArgs by navArgs()
        val a_veri =bundle.arabalar

        binding.textViewArabaAD.text="${a_veri.car_name}"
        binding.textViewFiyat.text="${a_veri.car_sell} Dolar"
        binding.imageView6.setImageResource(resources.getIdentifier(a_veri.car_photo,"drawable",requireContext().packageName))


        var hız=""
        var km=""

        when(a_veri.car_id){

            1 -> hız="250 Km/Hz"
            2 -> hız="200 Km/Hz"
            3 -> hız="350 Km/Hz"
            4 -> hız="450 Km/Hz"
            5 -> hız="300 Km/Hz"
            6 -> hız="500 Km/Hz"

        }
        when(a_veri.car_id){

            1 -> km="2500 Km"
            2 -> km="2000 Km"
            3 -> km="3500 Km"
            4 -> km="4500 Km"
            5 -> km="3000 Km"
            6 -> km="5000 Km"

        }


        val detay=ArrayList<Göstergeler>()
        val a1= Göstergeler(1,"$hız","km_resim")
        val a2= Göstergeler(2,"$km","max_resim")
        val a3= Göstergeler(3,"Service","settings_resim")
        val a4= Göstergeler(4,"Wifi","wifi_resim")
        val a5= Göstergeler(5,"Manuel","manuel_resim")
        val a6= Göstergeler(6,"Navigation","navigation_resim")

        detay.add(a1)
        detay.add(a2)
        detay.add(a3)
        detay.add(a4)
        detay.add(a5)
        detay.add(a6)

        val detayAdapter = DetayAdapter(requireContext(),detay) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
        binding.recyclerView2.adapter =detayAdapter


        binding.textView6.text="Aşağıdaki kilometre sınırları " +
                "İstanbul, İzmir, Ankara, Antalya, Bodrum, Dalaman, Trabzon, Samsun ve ……. daki" +
                " tüm ofislerimiz için geçerlidir. Diğer ofislerde ekonomik ve orta gruplarda 500 km," +
                " üst gruplarda 400 km günlük sınır bulunmaktadır."

        binding.buttonKirala.setOnClickListener {
            Snackbar.make(it,"Aracı Kiraladınız",Snackbar.LENGTH_LONG).show()
        }

        return binding.root
    }

}