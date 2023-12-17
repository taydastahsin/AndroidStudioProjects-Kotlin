package taydastahsin.com.navigationcompent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import taydastahsin.com.navigationcompent.databinding.FragmentBottomViewBinding

class BottomViewFragment : BottomSheetDialogFragment() {
   private lateinit var binding: FragmentBottomViewBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentBottomViewBinding.inflate(inflater, container, false)





        return binding.root
    }

}