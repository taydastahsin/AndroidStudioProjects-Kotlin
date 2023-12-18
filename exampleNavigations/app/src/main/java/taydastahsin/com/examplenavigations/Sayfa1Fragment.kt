package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import taydastahsin.com.examplenavigations.databinding.FragmentSayfa1Binding

class Sayfa1Fragment : Fragment() {
    private lateinit var binding: FragmentSayfa1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentSayfa1Binding.inflate(inflater, container, false)

        binding.button3Sayfa.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Sayfa1_Sayfa3_gecis)
        }

        return binding.root
    }

}