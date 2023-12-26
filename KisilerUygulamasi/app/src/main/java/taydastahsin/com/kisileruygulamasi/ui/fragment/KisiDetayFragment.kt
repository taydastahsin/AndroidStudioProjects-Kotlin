package taydastahsin.com.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import taydastahsin.com.kisileruygulamasi.R
import taydastahsin.com.kisileruygulamasi.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)

        binding.toolbarKisiDetay.title="Kişi Detay"

        val bundle :KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        binding.detayKisiAd.setText(gelenKisi.kisi_ad)
        binding.detayKisiTel.setText(gelenKisi.kisi_tel)

        binding.buttonDetayGuncelle.setOnClickListener {
            var kisi_ad =binding.detayKisiAd.text.toString()
            var kisi_tel = binding.detayKisiTel.text.toString()

            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }


        return binding.root
    }

    fun  guncelle(kisi_id :Int,kisi_ad:String,kisi_tel:String){

        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }


}