package taydastahsin.com.widgetskullanimi

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import taydastahsin.com.widgetskullanimi.databinding.ActivityMainBinding

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