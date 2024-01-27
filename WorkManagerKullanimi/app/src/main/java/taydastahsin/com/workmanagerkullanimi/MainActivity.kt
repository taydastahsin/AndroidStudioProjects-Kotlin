package taydastahsin.com.workmanagerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import taydastahsin.com.workmanagerkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener {
            val istek= OneTimeWorkRequestBuilder<MyWorker>().build()

            WorkManager.getInstance(this).enqueue(istek)
        }
    }
}