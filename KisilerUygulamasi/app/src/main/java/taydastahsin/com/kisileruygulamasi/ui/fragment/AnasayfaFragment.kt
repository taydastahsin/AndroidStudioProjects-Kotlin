package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import taydastahsin.com.kisileruygulamasi.ui.adapter.KisilerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.rv.layoutManager = LinearLayoutManager(requireContext())

        val veriList = ArrayList<Kisiler>()

        var k1 =Kisiler(1,"Tahsin","05392546511")
        var k2 =Kisiler(2,"Gözde","Kalbimin numarası")
        var k3 =Kisiler(3,"Sevgi","İsteyen herkes ulaşabilir")

        veriList.add(k1)
        veriList.add(k2)
        veriList.add(k3)

        val kisilerAdapter = KisilerAdapter(requireContext(),veriList)
        binding.rv.adapter = kisilerAdapter



        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_kayit_gecis)
        }



        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
              return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }

        })


        return binding.root

    }

    fun ara(girilenbilgi : String){
        Log.e("Kişi arama",girilenbilgi)
    }


}