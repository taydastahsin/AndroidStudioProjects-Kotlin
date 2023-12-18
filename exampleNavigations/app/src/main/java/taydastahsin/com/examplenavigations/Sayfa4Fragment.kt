package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import taydastahsin.com.examplenavigations.databinding.FragmentSayfa4Binding


class Sayfa4Fragment : Fragment() {
    private lateinit var binding: FragmentSayfa4Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfa4Binding.inflate(inflater, container, false)

        binding.S4buttonOrtakAlan.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Sayfa4_sonSayfa_gecis)
        }

        return binding.root
    }


}