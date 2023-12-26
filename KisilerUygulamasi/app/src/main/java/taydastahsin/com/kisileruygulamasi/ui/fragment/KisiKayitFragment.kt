package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {
    private  lateinit var binding: FragmentKisiKayitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)


        binding.buttonKaydet.setOnClickListener {
            var kisi_ad = binding.KisiKayitAd.text.toString()
            var kisi_tel = binding.KisiKayitTel.text.toString()

            kaydet(kisi_ad,kisi_tel)
            temizle()

        }

        return binding.root
    }

    fun kaydet(kisiAd : String,kisiTel :String){
        Log.e("Kişiler Kaydet","$kisiAd - $kisiTel")
    }
    fun temizle(){
        binding.KisiKayitAd.setText("")
        binding.KisiKayitTel.setText("")
    }


}