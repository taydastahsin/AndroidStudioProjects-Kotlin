package taydastahsin.com.todoaplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.todoaplication.databinding.FragmentDetayBinding
import taydastahsin.com.todoaplication.ui.viewmodel.DetayViewModel


class DetayFragment : Fragment() {
    private  lateinit var binding: FragmentDetayBinding
    private lateinit var viewModel: DetayViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentDetayBinding.inflate(inflater,container,false)


        return binding.root
    }

    fun buttonGuncelle(todo_id:Int,todo_baslik: String,todo_bilgi: String){
        viewModel.guncelle(todo_id,todo_baslik,todo_bilgi)
        Snackbar.make(binding.buttonGuncelle,"Güncellendi",Snackbar.LENGTH_LONG).show()
    }
    fun buttonSil(todo_id: Int){
        viewModel.sil(todo_id)
    }


}