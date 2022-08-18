package com.taydatahsin.myapplication9

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var heroList =ArrayList<String>()
        heroList.add("Batman")
        heroList.add("Süperman")
        heroList.add("Ironman")
        heroList.add("Aquaman")
        heroList.add("Spiderman")

        //Verimsiz Bitmap yöntemi
/*
        val batmanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var heroImageList =ArrayList<Bitmap>()
        heroImageList.add(batmanBitmap)
        heroImageList.add(supermanBitmap)
        heroImageList.add(ironmanBitmap)
        heroImageList.add(aquamanBitmap)
        heroImageList.add(spidermanBitmap)
*/
        //Verimli Bitmap yöntemi

        val batmanDrawbleid=R.drawable.batman
        val supermanDrawbleid=R.drawable.superman
        val ironmanDrawbleid=R.drawable.ironman
        val aquamanDrawbleid=R.drawable.aquaman
        val spidermanDrawbleid=R.drawable.spiderman

        var superKahramanListesi=ArrayList<Int>()
        superKahramanListesi.add(batmanDrawbleid)
        superKahramanListesi.add(supermanDrawbleid)
        superKahramanListesi.add(ironmanDrawbleid)
        superKahramanListesi.add(aquamanDrawbleid)
        superKahramanListesi.add(spidermanDrawbleid)



        //Adapter

        var layoutManager=LinearLayoutManager(this)
        recyclerView4.layoutManager=layoutManager


        val adapter =recycllerClass(heroList,superKahramanListesi)
        recyclerView4.adapter=adapter




    }
}