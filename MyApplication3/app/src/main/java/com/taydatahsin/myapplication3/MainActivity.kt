package com.taydatahsin.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun showHero(view: View){//button click işlemi
        var isim =heroName.text.toString()//ekrandaki textleri değişkenlere tanımladık
        var yas =heroYas.text.toString().toIntOrNull()
        var meslek =heroMeslek.text.toString()

        if (yas !=null){//int değerin null olup olmadığını kontrol ediyor
            val heroWrite=heroMan(isim,yas,meslek)//heroMan sınıfından değişken tanımladık
            textView.text="isim : ${heroWrite.isim} yaş : ${heroWrite.yas} meslek : ${heroWrite.meslek} "//değişkenleri textview yazdırıyoruz
        }
        else{
            textView.text="null değeri döndü"//eğer null değer dönerse yazacak
        }





    }
}