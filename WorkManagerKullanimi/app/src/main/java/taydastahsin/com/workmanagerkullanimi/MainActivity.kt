package taydastahsin.com.workmanagerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import taydastahsin.com.workmanagerkullanimi.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener {
            val calismaKosulu =Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()

            val istek= OneTimeWorkRequestBuilder<MyWorker>()
                .setInitialDelay(5,TimeUnit.SECONDS)
                .setConstraints(calismaKosulu)
                .build()

            WorkManager.getInstance(this).enqueue(istek)

            WorkManager.getInstance(this).getWorkInfoByIdLiveData(istek.id).observe(this){
                val durum = it.state.name
                Log.e("Arka Plan Durum : ",durum)
            }
        }
    }
}