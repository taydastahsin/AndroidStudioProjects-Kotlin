package com.taydatahsin.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ilkFun()//Fonksiyonu uygulama açılınca aktif hale getiriyoruz

        toplamaFun(5,10)//toplamaFun fonksiyonunu çağırdık,içine değer girdik

        var changeFun=carpmaFun(3,4)//fonksiyonu değişkene tanımladık
        println(changeFun)//fonksiyonun tanımlı olduğu değişkeni ekrana yazdırdık
    }

    // Fonksiyonlar
    fun ilkFun(){//Fonksiyon tanımı
        println("ilk fonksiyonum")
    }
    fun ikinciFun(){
        println("ikinci fonksiyon")
    }

    //Fonksiyon parametreleri

    fun toplamaFun(x:Int,y:Int){//fonksiyona x ve y değişkenlerini yazdık (türlerini belirttik)
        println("toplama sonuc : ${x+y}")//toplamaFun fonksiyonu çağrılınca ne yapılcağını belirttik
    }

    fun carpmaFun(x:Int,y:Int):Int{//Fonksiyonu belirttik,fonksiyonun türünü belirledik
        return x*y //fonksiyonda ne yapılması gerektiğini tanımladık
        //fonksiyon bir değişkene tanımlanıp kullanabilir halde
    }

    fun buttonS(view: View){
        println(toplamaFun(25,30)) //toplam fonksiyonu Logcate yazdırıyoruz
        var a=carpmaFun(8,6)//çarpma fonksiyonu bir değere atanmış
       textView.text="Sonuç : ${a}"//çarpma fonksiyonunu butonla textview e yazdırıyoruz
    }

}