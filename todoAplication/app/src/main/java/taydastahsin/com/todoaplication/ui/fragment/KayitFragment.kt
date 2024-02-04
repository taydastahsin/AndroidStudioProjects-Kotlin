package taydastahsin.com.todoaplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import taydastahsin.com.todoaplication.R
import taydastahsin.com.todoaplication.databinding.FragmentKayitBinding
import taydastahsin.com.todoaplication.ui.viewmodel.KayitViewModel


class KayitFragment : Fragment() {
   private lateinit var binding: FragmentKayitBinding
   private lateinit var viewModel:KayitViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKayitBinding.inflate(inflater,container,false)


        return binding.root
    }

    fun buttonKaydet(todo_baslik:String,todo_bilgi:String){
        viewModel.kaydet(todo_baslik,todo_bilgi)
        binding.TexViewBaslik.setText("")
        binding.editTextBilgi.setText("")
    }


}