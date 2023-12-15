package taydastahsin.com.navigationcompent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import taydastahsin.com.navigationcompent.databinding.FragmentAnasayfaBinding
import taydastahsin.com.navigationcompent.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentDetayBinding.inflate(inflater, container, false)

        val bundle :DetayFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar
        val gelenUrunId = bundle.urun.id
        val gelenUrunAd =bundle.urun.ad

        binding.textView3.text="$gelenAd-$gelenYas-$gelenBoy-$gelenBekar-$gelenUrunId-$gelenUrunAd"

        return binding.root
    }


}