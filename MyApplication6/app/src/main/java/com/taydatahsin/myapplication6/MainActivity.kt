package com.taydatahsin.myapplication6

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPrefences : SharedPreferences
    var alinanVeri :String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPrefences=this.getSharedPreferences("com.taydatahsin.myapplication6",Context.MODE_PRIVATE)
    }

    fun saveData(view:View){
        var data = editData.text.toString()
        if (data ==""){
            Toast.makeText(this,"Lütfen bir değer giriniz",Toast.LENGTH_LONG).show()
        }else{
            sharedPrefences.edit().putString("goData",data).apply()
            editData.text.clear()
        }

    }
    fun clearData(view: View){
        alinanVeri=sharedPrefences.getString("goData","")
         if ( alinanVeri!=null){
             textView.text="Kaydedilen veri :"
             sharedPrefences.edit().remove("goData").apply()
         }

    }

    fun showData(view: View){
        alinanVeri=sharedPrefences.getString("goData","")
        textView.text="Kaydedeilen veri : ${alinanVeri}"

    }

}