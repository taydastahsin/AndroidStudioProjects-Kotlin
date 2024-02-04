package taydastahsin.com.todoaplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import taydastahsin.com.todoaplication.R
import taydastahsin.com.todoaplication.databinding.FragmentAnasayfaBinding
import taydastahsin.com.todoaplication.ui.viewmodel.AnasayfaViewModel

@AndroidEntryPoint
class AnasayfaFragment  : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)


        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                return true
            }
        })


        return binding.root
    }



}