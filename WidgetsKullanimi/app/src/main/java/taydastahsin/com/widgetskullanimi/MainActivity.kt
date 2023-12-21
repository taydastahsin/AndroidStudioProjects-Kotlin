package taydastahsin.com.widgetskullanimi

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import taydastahsin.com.widgetskullanimi.databinding.ActivityMainBinding
import java.text.Format
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var kontrol = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYansit.setOnClickListener {

            val bilgi = binding.editTextText3.text.toString()
            binding.textView3.text =bilgi
        }

        binding.buttonResim1.setOnClickListener {

            binding.imageView2.setImageResource(R.drawable.resim1)//"resim1" resmini bize çağırıyor
        }
        binding.buttonResim2.setOnClickListener {

            binding.imageView2.setImageResource(resources.getIdentifier("resim2","drawable",packageName)) // "resim2" resmi eğer veri tabanında text
            // olarak çağırıldığında kullanılan yöntem
        }

        binding.switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Log.e("Sonuc","Swich ON")
            }
            else{
                Log.e("Sonuc","Swich OFF")

            }

        }

        binding.toggButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            kontrol =isChecked
            if (kontrol) {

                val secilenButton = findViewById<Button>(binding.toggButton.checkedButtonId)
                val secilenYazi = secilenButton.text.toString()
                Log.e("Sonuc", "Buton :  $secilenYazi")
            }

        }

        binding.buttonBaslat.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonDur.setOnClickListener {
            binding.progressBar.visibility =View.INVISIBLE
        }

        binding.textViewProgresShow.text= binding.seekBar.progress.toString()

        binding.seekBar.setOnSeekBarChangeListener(object  :OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
               binding.textViewProgresShow.text =progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })


        binding.buttonSaat.setOnClickListener {
            val tp =MaterialTimePicker.Builder() // Zaman kütüphanesini çağırıyoruz
                .setTitleText("Saat Seçiniz")//Saatin üstünde başlık
                .setTimeFormat(TimeFormat.CLOCK_24H) //Saat dilimlerini ayarladık
                .build()//Saati oluşturduk.

            tp.show(supportFragmentManager,"Saat")//Saatin ekranda gözükmesine yarıyor.

            tp.addOnPositiveButtonClickListener {//Ekranda açılan saatin tıklanıldığında yani ayarlandıuğında ne yapmasını ayarladık.
                binding.editTextSaat.setText("Saat ${tp.hour} : ${tp.minute}")//Ayarlanan saati EditText e aktararak ekranda gösterdik.
            }
        }

        binding.buttonTarih.setOnClickListener {
            val dp = MaterialDatePicker.Builder.datePicker()//Tarih kütüphanesini oluşturuyoruz
                .setTitleText("Tarih belirleyiniz")//Tarih için açılan takvimde başlık
                .build()//Takvimi oluşturduk.

            dp.show(supportFragmentManager,"Tarih")//Takvim ekranda gösterdi.

            dp.addOnPositiveButtonClickListener {//Ekranda gösterilen takvimde seçilen zamanı EditText e aktarmak için kullandık.
                val df = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())//Takvimin aktarırken hangi formatta aktaracağımızı belirledik.
                val tarih =df.format(it)//Formatını belirlediğimiz tarihi nerden alacağımızı yani oluşturduğumuz kütüphaneden aldığımız takvimden aldık.

                binding.editTextTarih.setText(tarih)//EditText'e "tarih" adlı neseneye tanımladığımız tavim zamanını yazdırdık.
            }
        }

        binding.buttonGoster.setOnClickListener {

            val swichBilgi =binding.switch5.isChecked
            Log.e("Sonuc","Swich Durumu : ${swichBilgi.toString()}")
            if (kontrol) {

                val secilenButton = findViewById<Button>(binding.toggButton.checkedButtonId)
                val secilenYazi = secilenButton.text.toString()
                Log.e("Sonuc", "Seçilen Buton :  $secilenYazi")
            }
            Log.e("Sonuc","Progres Durumu : ${binding.seekBar.progress}")

        }


    }
}