package com.taydatahsin.myapplication7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var no=0//Kronometemiz için değer değişkenimiz
    var runnable:Runnable= Runnable {  }//"Runnable" her yerde kullanabilmke için tanımlıyoruz(handler' ı da)
    var handler= Handler(Looper.myLooper()!!)//normalde java desteklemezken "Looper" ile destekliyor.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun startMeter(view: View){
        no=0
        runnable= object:Runnable{//"runnable nesnesini oluşturdu
            override fun run() {//kendi fonkisyonu geldi
                no+=1//sayaç için değeri artırdık
                textView.text="Sayaç :${no}"//değeri ekran yazdırdık
                handler.postDelayed(runnable,1000)//Sayacın 1 sn de artmasını sağladık
            }

        }
        handler.post(runnable)//"runnable nesnesini sürekli döndüren fonksiyonu yazdık

    }
    fun stopMeter(view: View){
        handler.removeCallbacks(runnable)
        textView.text="Sayaç : 0"
        Toast.makeText(this,"Yeniden başlatmabak için Başlat tuşuna basınız!!!",Toast.LENGTH_LONG).show()

    }



}