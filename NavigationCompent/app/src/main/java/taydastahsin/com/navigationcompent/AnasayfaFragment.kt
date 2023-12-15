package taydastahsin.com.navigationcompent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout
import taydastahsin.com.navigationcompent.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener{
            //Snackbar.make(it,"Nasılsınız",Snackbar.LENGTH_SHORT).show()

            //binding.textView.text="Değişti"

            val urun = Urun(10,"ayna")
            val gecis = AnasayfaFragmentDirections.detayGecis(urun=urun, ad = "Tahsin", yas = 25, boy = 180f,bekar = true)



            Navigation.findNavController(it).navigate(gecis)

        }


        return binding.root
    }



}