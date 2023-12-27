package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.data.entity.Kisiler
import taydastahsin.com.kisileruygulamasi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_kayit_gecis)
        }



        binding.searchView.setOnSearchClickListener { object :OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return  true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
               return  true
            }
        } }


        return binding.root

    }

    fun ara(girilenbilgi : String){
        Log.e("Kişi arama",girilenbilgi)
    }


}