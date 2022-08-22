package com.taydatahsin.myapplication11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second_blank.*

class secondBlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val kullaniciadi =secondBlankFragmentArgs.fromBundle(it).username
            textView2.text=kullaniciadi
        }
        buttonBack.setOnClickListener {
            val action=secondBlankFragmentDirections.actionSecondBlankFragmentToFirstBlankFragment()
            Navigation.findNavController(it).navigate(action)

        }
    }

}