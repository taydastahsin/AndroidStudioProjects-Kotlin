package com.taydatahsin.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var intent =intent
        var comeData = intent.getStringExtra("gelenVeri")
        textView3.text=comeData
    }
    fun comePanel(view: View){
        var intent =Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}