package com.taydatahsin.myapplication9

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    // "recycllerClass" sınıfından veri alabilmek için "intent" kullandım
        val intent =intent
        val secilenKahraman= intent.getStringExtra("superKahraman")//veriyi key ile süper kahraman isimlerini aldım
        textView.text=secilenKahraman//ekrana yazdırdım
/*
        //"Singleton" yöntemi ile "Bitmap" türünde aldığımız değerleri tanımladım
        val singleton =singletonClass.secilenKahraman
        val secilenKahraman =singleton.gorsel
        imageView.setImageBitmap(secilenKahraman)

 */
    val secilenKahramanGorsel =intent.getIntExtra("kahramanGörselleri",0)//veriyi key ile süper kahraman görsellerini aldım
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorsel)
        imageView.setImageBitmap(bitmap)//ekrana gönderdim

    }
}