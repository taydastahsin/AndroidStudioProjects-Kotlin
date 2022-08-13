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

        agaclar()

        nulGuvenligi()
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
/*
    fun agaclar(){//agaclar fonksiyonunu tanımlıyoruz
        var agac=Tree() // "Tree" sınıfını "agac" değişkenine tanımlıyoruz
        agac.isim="Çam Ağacı"//Sınıfın içindeki değişkenlerin değerlerini giriyoruz
        agac.yas=15
        agac.tur="ince yapraklı"

        println(agaclar())

    }
*/
    /*
    fun agaclar(){//fonksiyon tanımladık
        var agac =Tree("Ceviz Ağacı",25,"Odunsu")//Sınıfın değerlerini yazdırdık
    textView.text="isim : ${agac.isim}"//"Tree" sınıfının değişkenlerinin değerlerini "agac" değişkeni ile yazdırdık
    }
*/

    fun agaclar(){//fonksiyon tanımladık
        var agac =Tree("Ceviz Ağacı",25,"Odunsu")//Sınıfın değerlerini yazdırdık(Kotline özel)
        textView.text="isim : ${agac.isim}"//"Tree" sınıfının değişkenlerinin değerlerini "agac" değişkeni ile yazdırdık
    //Sınıf kısmındaki primary constructor yöntemi ile tek satırda kolaylıkla oluşturabiliriz.

        agac.testClass()//Sınıfın içindeki fonksiyonu çağırdık
    }

    fun nulGuvenligi(){
        var benimYas :Int? = null //int değer gelmeyebilir diye belirtiyoruz (Kullanıcının hatalı girişi için)
        println(benimYas)

       // benimYas =2
        //1. yöntem if-else konrol ederek yazdırma
        if (benimYas !=null){
            println(benimYas)
        }
        else{
            println("null değer döndü")
        }

        //2 .yöntem null olup(?) olmadığını(!!) belirtiyoruz

        println(benimYas?.minus(5))//null olabilir
        println(benimYas!!.minus(3))//null olmadığından eminim

        //3.yöntem elvis operatörü

        val sonuc=benimYas?.minus(5) ?:"null değer döndü"
        println(sonuc)

        //4.yöntem let yöntemi
        // "benimyas" değişkenini "it" ye atayıp değerini kullanıyoruz
        benimYas.let {
            println(it+5)
        }


    }

}