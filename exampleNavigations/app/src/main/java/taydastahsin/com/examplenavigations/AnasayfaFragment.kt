package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import taydastahsin.com.examplenavigations.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private  lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.button1Sayfa.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Anasayfa_Sayfa1_gecis)
        }

        binding.button2Sayfa.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Anasayfa_Sayfa2_gecis)
        }

        return binding.root
    }

}