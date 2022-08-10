package com.taydatahsin.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Değişkenler

        var x=5 // verilen değeri aktif olarak değiştirilebilir
        val y=5 // verilen değeri değiştirelemez

        //********Integer**********
         val integerexample :Int//Tanımlama

         integerexample=5 //Değerin verilmesi

        //********Long*********
        val longExample :Long //tanım(integer 'a sığmayan değerleri tutar)

        longExample =555555555555555 // değer

        //***********Double************

        val doubleExample :Double//ONdalıklı değer tanım

        doubleExample =3.5 //ondalıklı değer

        //***********String***********

        val stringExample :String //Tanımlama

        stringExample="Merhaba Dünya" //String değeri (değeri çift tırnak arasına alıyoruz)

        //*********Char****************

        val charExample :Char //Tanımlama

        charExample='a' //Char değeri (değeri tek tırnak arasına alıyoruz)

        //**************Boolean**************

        var booleanExample =true//Boolean değişkeni doğru ve yanlış argümanlarını kullanır
        booleanExample=false//Argümanlar 1 ve 0 gibi düşünebiliriz

        // <  -> küçüktür
        // >  -> büyüktür
        // =  -> eşittir
        // != -> eşit değildir
        // <= -> küçüktür ve eşittir
        // >= -> büyüktür ve eşittir
        // && -> ve
        // || -> veya



    }
}