package taydastahsin.com.notdefterim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import taydastahsin.com.notdefterim.R
import taydastahsin.com.notdefterim.data.entity.notDefteri
import taydastahsin.com.notdefterim.databinding.FragmentAnasayfaBinding
import taydastahsin.com.notdefterim.ui.adapter.NotDefteriAdapter

class AnasayfaFragment : Fragment() {
    private  lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title="Not Deteri Uygulaması"

        binding.recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val bilgi =ArrayList<notDefteri>()
        val n1 = notDefteri(1,"Not 1","Birinci not")
        val n2 = notDefteri(2,"Not 2","İkinci not")
        val n3 = notDefteri(3,"Not 3","Üçüncü not")
        val n4 = notDefteri(4,"Not 4","Dördüncü not")
        val n5 = notDefteri(5,"Not 5","Beşinci not")
        val n6 = notDefteri(6,"Not 6","Altıncı not")
        val n7 = notDefteri(7,"Not 7","Yedinci not")
        val n8 = notDefteri(8,"Not 8","Sekizinci not")
        val n9 = notDefteri(9,"Not 9","Dokuzuncu not")
        val n10 = notDefteri(10,"Not 10","Onuncu not")

        bilgi.add(n1)
        bilgi.add(n2)
        bilgi.add(n3)
        bilgi.add(n4)
        bilgi.add(n5)
        bilgi.add(n6)
        bilgi.add(n7)
        bilgi.add(n8)
        bilgi.add(n9)
        bilgi.add(n10)

        val notDefteriAdapter =NotDefteriAdapter(requireContext(),bilgi)
       // binding.recyclerView.adapter=notDefteriAdapter

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_detay_gecis)
        }



        return binding.root
    }

}