package com.taydatahsin.myapplication10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun forwadFragment(view:View){//ileri buttonu fonksiyonu oluşturdum

        val fragmentManager =supportFragmentManager//fragment destek yöneticisini değişkene atadım
        val fragmentTransaction=fragmentManager.beginTransaction()//destek yöneticsinden "fragmentManager" çağırdım ve başlatmasını söyledim

        val firsFragment=BlankFragment()//fragment yapısını birinci değişkenini tanımladım
        fragmentTransaction.replace(R.id.frameLayout2,firsFragment).commit()//fragment yöneticisinden ana ekrandaki "frameLayout2" olarak oluşturduğum
        //kısma ilk fragment yapısını gösterdim

    }
    fun backFragment(view: View){//geri buttonu fonksiyonu oluşturdum
        val fragmentManager =supportFragmentManager//fragment destek yöneticisini değişkene atadım
        val fragmentTransaction=fragmentManager.beginTransaction()//destek yöneticsinden "fragmentManager" çağırdım ve başlatmasını söyledim

        val firsFragment=BlankFragment2()//fragment yapısını ikinci değişkenini tanımladım
        fragmentTransaction.replace(R.id.frameLayout2,firsFragment).commit()//fragment yöneticisinden ana ekrandaki "frameLayout2" olarak oluşturduğum
        //kısma ikinci fragment yapısını gösterdim


    }
}