package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_kisi_detay, container, false)

        binding.toolbarTitle="Kişi Detay"
        binding.kisiDetayFragment=this

        val bundle :KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi
       binding.detayNesnesi=gelenKisi

        return binding.root
    }

    fun  buttonguncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String){

        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }


}