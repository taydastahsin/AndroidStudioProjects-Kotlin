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
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.data.repository.KisiRepository
import taydastahsin.com.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import taydastahsin.com.kisileruygulamasi.ui.adapter.KisilerAdapter
import taydastahsin.com.kisileruygulamasi.ui.viewmodel.AnasayfaViewModel


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)
        binding.anasayfaFragment=this
        binding.toolbarTitle="Kişiler Uygulaması"

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            val kisilerAdapter = KisilerAdapter(requireContext(),it,viewModel)
            binding.kisilerAdapter = kisilerAdapter
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempRepository:AnasayfaViewModel by viewModels()
        viewModel=tempRepository
    }

    fun ara(girilenbilgi : String){
        Log.e("Kişi arama",girilenbilgi)
    }

    fun fab(it:View){
        Navigation.findNavController(it).navigate(R.id.anasayfa_kayit_gecis)
    }


}