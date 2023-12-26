package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
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

        binding.buttonDetay.setOnClickListener {
            var kisi = Kisiler(1,"Tahsin","05392546511")
            var gecis =AnasayfaFragmentDirections.anasayfaDetayGecis(kisi=kisi)

            Navigation.findNavController(it).navigate(gecis)

        }


        return binding.root

    }


}