package com.taydatahsin.myapplication8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Object
        //Sayaç
        object:CountDownTimer(15000,1000) {// Sayacı oluşturmak için nesne olduğunu gösterdik
            //"CountDownTimer" parametresini girip ilk sınırı sonra kaçar kaçar gidiceğini milisaniye(*1000) olarak gösterilir
            override fun onTick(millisUntilFinished: Long) {//Sayacın başladığında kullancağımız fonksiyon
                textView.text="Kalan : ${millisUntilFinished /1000}"

            }

            override fun onFinish() {//Sayacın bitiminde kullancağımız fonksiyon
                textView.text="Süreniz Bitmiştir!!!"
            }

        }.start()//Sayaç objesini çalıştırmak için kullanırığımız komut (zorunlu)


    }
}