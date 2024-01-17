package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiKayitBinding
import taydastahsin.com.kisileruygulamasi.ui.viewmodel.KisiKayitViewModel


class KisiKayitFragment : Fragment() {
    private  lateinit var binding: FragmentKisiKayitBinding
    private lateinit var viewModel: KisiKayitViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_kayit,container, false)

        binding.kisiKayitFragment=this
        binding.toolbarTitle="Kişi Kayıt"

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:KisiKayitViewModel by viewModels()
        viewModel =tempViewModel
    }

    fun buttonkaydet(kisiAd : String,kisiTel :String){
        viewModel.buttonkaydet(kisiAd,kisiTel)

    }



}