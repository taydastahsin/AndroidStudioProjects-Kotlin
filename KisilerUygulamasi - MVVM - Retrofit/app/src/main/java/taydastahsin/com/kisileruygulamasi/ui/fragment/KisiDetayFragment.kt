package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import taydastahsin.com.kisileruygulamasi.ui.viewmodel.KisiDetayViewModel
import taydastahsin.com.kisileruygulamasi.ui.viewmodel.KisiKayitViewModel


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    private lateinit var viewModel: KisiDetayViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_kisi_detay, container, false)

        binding.toolbarTitle="Kişi Detay"
        binding.kisiDetayFragment=this

        val bundle :KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi
       binding.detayNesnesi=gelenKisi

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:KisiDetayViewModel by viewModels()
        viewModel=tempViewModel
    }

    fun  buttonguncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String){
        viewModel.buttonguncelle(kisi_id,kisi_ad,kisi_tel)
    }


}