package taydastahsin.com.mycalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import taydastahsin.com.mycalculater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var a =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSayi1.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"1")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi2.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"2")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi3.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"3")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi4.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"4")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi5.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"5")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi6.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"6")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi7.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"7")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi8.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"8")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi9.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"9")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayi0.setOnClickListener {
            binding.editTextSayilar.setText(binding.editTextSayilar.text.toString()+"0")
            var sayi = binding.editTextSayilar.text.toString()
            binding.textViewSayilariGoster.text="${sayi}"
        }
        binding.buttonSayiTopla.setOnClickListener {
            var deger =binding.editTextSayilar.text.toString()
            a =deger.toInt()
            binding.textViewSayilariGoster.text="${deger}+"
            binding.editTextSayilar.text.clear()


        }
        binding.buttonSonuc.setOnClickListener {
           var toplama = a+binding.editTextSayilar.text.toString().toInt()
            var b =binding.editTextSayilar.text.toString().toInt()
            binding.editTextSayilar.setText(toplama.toString())
            binding.textViewSayilariGoster.text="${a}+${b} = ${toplama}"

        }
        binding.buttonSayiTemizle.setOnClickListener {
            a=0
            binding.textViewSayilariGoster.text=""
            binding.editTextSayilar.text.clear()
        }

    }
}