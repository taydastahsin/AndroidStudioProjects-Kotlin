package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {
    private  lateinit var binding: FragmentKisiKayitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_kayit,container, false)

        binding.kisiKayitFragment=this
        binding.toolbarTitle="Kişi Kayıt"

        return binding.root
    }

    fun buttonkaydet(kisiAd : String,kisiTel :String){
        Log.e("Kişiler Kaydet","$kisiAd - $kisiTel")

    }



}