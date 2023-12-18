package taydastahsin.com.examplenavigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.examplenavigations.databinding.FragmentSayfa4Binding
import taydastahsin.com.examplenavigations.databinding.FragmentSonSayfaBinding


class SonSayfaFragment : Fragment() {
    private lateinit var binding: FragmentSonSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSonSayfaBinding.inflate(inflater, container, false)

        binding.buttonAnasayfa.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sonSayfa_Anasayfa_gecis)
        }

        val backGet = object :OnBackPressedCallback(true){

            override fun handleOnBackPressed() {

                Snackbar.make(binding.textView4,"Anasayfaya dönmek istermisiniz",Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled =false
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }
                    .show()

            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backGet)


        return binding.root
    }

}