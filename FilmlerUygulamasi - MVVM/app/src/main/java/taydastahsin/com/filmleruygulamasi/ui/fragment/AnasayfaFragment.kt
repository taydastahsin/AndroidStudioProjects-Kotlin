package taydastahsin.com.filmleruygulamasi.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import taydastahsin.com.filmleruygulamasi.R
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler
import taydastahsin.com.filmleruygulamasi.databinding.FragmentAnasayfaBinding
import taydastahsin.com.filmleruygulamasi.ui.adapter.FilmlerAdapter
import taydastahsin.com.filmleruygulamasi.ui.viewmodel.anasayfaViewModel


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding //Anasayfa fragment araçları kullanmak için tanımladığımız yöntem
    private lateinit var viewModel: anasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false) //"bindding" yapısına fragment'i entegre ettik

        binding.toolbarTitle="Filmler" //Toolbar'ımıza başlık tanımladık.

        viewModel.filmNesnesi.observe(viewLifecycleOwner){
            val filmAdapter = FilmlerAdapter(requireContext(),it) //Oluşturduğumuz verileri "FilmlerAdapter" sınıfımızda tanımlatıp "rcy" a aktardık.
            binding.filmNesnesi =filmAdapter
        }




        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempModel:anasayfaViewModel by viewModels()
        viewModel=tempModel

    }

}