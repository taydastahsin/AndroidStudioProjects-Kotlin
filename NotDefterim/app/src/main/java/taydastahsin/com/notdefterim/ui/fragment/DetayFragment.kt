package taydastahsin.com.notdefterim.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.notdefterim.R
import taydastahsin.com.notdefterim.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val gelenBilgi =bundle.bilgi

        binding.toolbarDetay.title="Notlarım"
        binding.editTextBaslik.setText(gelenBilgi.n_baslik)
        binding.editTextBilgi.setText(gelenBilgi.n_bilgi)

        binding.buttonKaydet.setOnClickListener {

            var degisen_baslik=binding.editTextBaslik.text.toString()
            var degisen_bilgi =binding.editTextBilgi.text.toString()

            kaydet(gelenBilgi.n_id,degisen_baslik,degisen_bilgi)

        }

        return binding.root
    }

    fun kaydet(n_id:Int,n_baslik:String,n_bilgi:String){

        Log.e("Not Defteri","$n_baslik Kaydedildi")
    }


}