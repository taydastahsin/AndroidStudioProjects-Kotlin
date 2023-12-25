package taydastahsin.com.kisilerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import taydastahsin.com.kisilerapp.databinding.FragmentKayitBinding


class KayitFragment : Fragment() {
    private  lateinit var binding: FragmentKayitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

}