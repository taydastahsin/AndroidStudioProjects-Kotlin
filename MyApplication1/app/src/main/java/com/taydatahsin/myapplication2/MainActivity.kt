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

        // Veri Dönüştürme

        val dataChange = "50" //Girilen string değeri

        val showData=dataChange.toInt() // değeri int değere çevirme
       // println(showData) // değişen değişkeni gösterme


        //Diziler(array of )

        val diziNo=5
        val diziExample= arrayOf(diziNo,"Ali","veli","deli")//dizi tanımlıyoruz ve eleman ekliyoruz.
        println(diziExample.get(0)) //dizinin 0. indeksini getirir.
        //println(diziExample[0]) // dizinin 0. indeksini getirir.
        diziExample.set(1,"Tahsin")//dizinin 1. indeksini değiştiriyoruz.
        println(diziExample.get(1))

        val doubleDizi = doubleArrayOf(2.5,3.0,4.5)//diziyi double değerlerle eleman ekledik.(Tam sayı kabul etmez)
        println(doubleDizi.get(2))

        val karisikDizi = arrayOf("Tahsin",23,true,23,5)
        println(karisikDizi.get(0))

        //Listeler(arraylist of)

        val listeExample= arrayListOf("merhaba","hoş geldiniz") //liste oluşturuyoruz.String türünde eleman ekliyoruz
        val listeExample1= arrayListOf<Any>("Tahsin",3,true,3.5)// listeyi "<>"işaretleri içeresinde bulunan değişken türüne göre tanımlıyoruz
        //listedeki "any" değişkeni herşey anlamına geliyor.bütün değişken türdeki elemanları içine alır.

        println(listeExample.get(1))//listedeki 1. indeksi getirir
        listeExample1.set(1,5)//listedeki 1.indeksi değiştirir.
        println(listeExample1.get(1))//listedeki 1.indeksi getirir.

        // Set (içersindeki elemanlardan sadece 1 adet bulunur)
        val setExample= setOf<Int>(6,6,10,12,13,15,13)
        for (i in setExample) {//for döngüsü bütün elemanları yazar
            println(i)
        }

        //hashmap (hashmap of)
        val hashExample = HashMap<Int,String>()// anahtar bir değer seçerek karşılığına gelen değeri gösterir.
        hashExample.put(1,"Tahsin")
        hashExample.put(2 ,"Batuhan")
        hashExample.put(3,"Doğukan")

        println(hashExample.get(1))

        val hashExample1= hashMapOf<Int,String>(1 to "Burak",2 to "Hakkı")//hash 'in farklı türde yazımı

        //Matematiksel Operatörler

        val sayi1=6
        val sayi2=6

        println(sayi1+sayi2)//Toplama operatörü
        println(sayi1-sayi2)//Çıkarma operatörü
        println(sayi1*sayi2)//Çarpma operatörü
        println(sayi1/sayi2)//Bölme operatörü
        println(sayi1%sayi2)//Kalan operatörü


        // if-elseif-else (Eğer koşulu)

        val notNo=60

        if (notNo<50){
            println("Kaldınız")
        }
        else if (notNo>=50 ){
            println("Geçtiniz")
        }
        else{
            println("Geçtiniz")
        }

        //when (Swich-case gibi koşulun fazla olduğu yerde kullanılır)

        val dereceNo =3

        when(dereceNo){
            0-> println("çok kötü")
            1-> println("kötü")
            2-> println("orta")
            3-> println("iyi")
            4-> println("çok iyi")
        }

        //Döngüler

        //For Döngüsü
        val forDizi= arrayListOf<Any>(5,"tahsin",true)

        for (per in forDizi){//diziyi "per" değişkenine atadık
            println(per)//"per değişkenini yazdırdık
        }

        for (sayi in 0..3){//0-3 e kadar sayıları yazdırdık
            println(sayi)
        }

        //While Döngüsü
        var whileDeger =0
        while (whileDeger<10){//döngüde koşul belirttik
            println(whileDeger)//döngü elemanlarını yazdık
            whileDeger+=1//döngü değerini sonsuz olmasın diye artırdık.
        }





    }
}