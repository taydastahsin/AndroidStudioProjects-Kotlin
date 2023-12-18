package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import taydastahsin.com.examplenavigations.databinding.FragmentSayfa3Binding


class Sayfa3Fragment : Fragment() {
    private lateinit var binding: FragmentSayfa3Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfa3Binding.inflate(inflater, container, false)

        binding.S3buttonOrtakALan.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.Sayfa3_sonSayfa_gecis)
        }

        return binding.root
    }

}