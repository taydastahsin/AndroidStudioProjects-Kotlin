package taydastahsin.com.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.kullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this,"Merhaba",Toast.LENGTH_LONG)//Ekranın altında mesaj çıkarır
                .show()
        }
        binding.buttonSnackbar.setOnClickListener {
            Snackbar.make(it,"Hoşgeldiniz Çıkmak istermisiniz?",Snackbar.LENGTH_LONG)//Ekranın altında Seçenek sunar ve işlem yapar.
                .setAction("Evet"){
                    Snackbar.make(it,"Çıkışınız tamamlandı.",Snackbar.LENGTH_LONG)
                        .setBackgroundTint(Color.WHITE)
                        .setTextColor(Color.BLUE)
                        .show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }
        binding.buttonDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this)//Ekrana MEsaj kutusu getirir ve kullanıcının seçim yapmasını ister üzerine işlem yapılır.
                .setTitle("Başlık")
                .setMessage("Mesajınızı iletiniz!!!")
                .setPositiveButton("Evet"){d,i ->
                    Toast.makeText(this,"Evet dediniz",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Hayır"){d,i ->
                    Toast.makeText(this,"Hayır dediniz",Toast.LENGTH_LONG).show()
                }
                .show()
        }

    }
}