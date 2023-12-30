package taydastahsin.com.filmleruygulamasi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import taydastahsin.com.filmleruygulamasi.R
import taydastahsin.com.filmleruygulamasi.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentDetayBinding.inflate(inflater, container, false)

        return binding.root
    }


}