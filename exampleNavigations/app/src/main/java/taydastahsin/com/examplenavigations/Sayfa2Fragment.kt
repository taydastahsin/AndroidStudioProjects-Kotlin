package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import taydastahsin.com.examplenavigations.databinding.FragmentSayfa2Binding


class Sayfa2Fragment : Fragment() {
    private lateinit var binding: FragmentSayfa2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfa2Binding.inflate(inflater, container, false)

        binding.button4Sayfa.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Sayfa2_Sayfa4_gecis)
        }

        return binding.root
    }


}