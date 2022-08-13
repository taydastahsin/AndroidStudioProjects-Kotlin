package com.taydatahsin.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun topla(view: View){
        var birinciSayi= sayi1.text.toString().toInt()
        var ikinciSayi=sayi2.text.toString().toInt()

      if (birinciSayi !=null && ikinciSayi !=null){
          sonucText.text="Sonuç : ${birinciSayi+ikinciSayi}"
      }
        else{
            sonucText.text="null değer var"
      }

    }
    fun cikar(view: View){
        var birinciSayi= sayi1.text.toString().toInt()
        var ikinciSayi=sayi2.text.toString().toInt()

        if (birinciSayi !=null && ikinciSayi !=null){
            sonucText.text="Sonuç : ${birinciSayi-ikinciSayi}"
        }
        else{
            sonucText.text="null değer var"
        }

    }
    fun carp(view: View){
        var birinciSayi= sayi1.text.toString().toInt()
        var ikinciSayi=sayi2.text.toString().toInt()

        if (birinciSayi !=null && ikinciSayi !=null){
            sonucText.text="Sonuç : ${birinciSayi*ikinciSayi}"
        }
        else{
            sonucText.text="null değer var"
        }

    }
    fun bol(view: View){
        var birinciSayi= sayi1.text.toString().toInt()
        var ikinciSayi=sayi2.text.toString().toInt()

        if (birinciSayi !=null && ikinciSayi !=null){
            sonucText.text="Sonuç : ${birinciSayi/ikinciSayi}"
        }
        else{
            sonucText.text="null değer var"
        }

    }
}