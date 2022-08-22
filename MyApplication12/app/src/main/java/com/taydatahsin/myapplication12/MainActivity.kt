package com.taydatahsin.myapplication12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//try-catch mantığı kodda yanlış olduğunda sistem çökmeden hata mesajı vermesidir
        //kodu try kısmına yazarız catch kısmında hata olunca ne yapmasını söyleriz
        try {
            //  "urunler" adında veritabanı dökümanını oluşturmak için değişken tanımladım
            val veritabani=this.openOrCreateDatabase("urunler", MODE_PRIVATE,null)
            //veritabanı varsa kullan yoksa oluştur dedim
            //tablo isminden sonra tablonun sütun başlıklarını yazdım
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS urunler(id INTEGER PRIMARY KEY," +
                    "isim VARCHAR,fiyat INT)")

           // veritabani.execSQL("INSERT INTO urunler (isim,fiyat)VALUES ('Ayakkabi',100)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat)VALUES ('canta',35)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat)VALUES ('mont',250)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat)VALUES ('gozluk',150)")

           //veritabani.execSQL("DELETE FROM urunler WHERE id=1")//istenilen veriyi siler
            //veritabani.execSQL("UPDATE urunler SET fiyat=55 WHERE isim='canta'")// veritabanı günceller

            val cursor=veritabani.rawQuery("SELECT * FROM urunler",null)
           // val cursor=veritabani.rawQuery("SELECT * FROM urunler WHERE isim LIKE'a%'",null)//a ile başlayanı gösterir
            //val cursor=veritabani.rawQuery("SELECT * FROM urunler WHERE id='3'",null)//id 3 olanı gösterir
           // val cursor=veritabani.rawQuery("SELECT * FROM urunler",null)//bütün tabloyu gösterir

            val idColumnIndex =cursor.getColumnIndex("id")
            val isimColumnIndex=cursor.getColumnIndex("isim")
            val fiyatColumnIndex=cursor.getColumnIndex("fiyat")

            while (cursor.moveToNext()){
                println("Id : ${cursor.getInt(idColumnIndex)}")
                println("Id : ${cursor.getString(isimColumnIndex)}")
                println("Id : ${cursor.getInt(fiyatColumnIndex)}")
            }


        }catch (e:Exception){
            e.printStackTrace()
        }


    }
}