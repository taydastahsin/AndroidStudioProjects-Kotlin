package taydastahsin.com.konumkullanimi

import android.Manifest
import android.content.pm.PackageManager
import android.health.connect.datatypes.ExerciseRoute.Location
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task
import taydastahsin.com.konumkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var izinKontrol =0
    private lateinit var flpc:FusedLocationProviderClient
    private lateinit var locationTask: Task<Location>
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        flpc = LocationServices.getFusedLocationProviderClient(this)

        binding.buttonKonumAl.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)

            if (izinKontrol==PackageManager.PERMISSION_GRANTED){//izin onaylandığında
              //  locationTask =flpc.lastLocation
                konumBilgisi()
            }
            else{
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),100)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
     fun konumBilgisi() {
        locationTask.addOnSuccessListener {
            if (it != null){
                binding.textViewEnlem.text =  "Enlem : ${it.latitude}"
                binding.textViewBoylam.text = "Boylam : ${it.longitude}"
            }
            else {
                binding.textViewEnlem.text= "Enlem bulunamadı"
                binding.textViewBoylam.text="Boylam bulunamadı"
            }
        }

    }

    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode==100){
            izinKontrol = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
            if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
               // locationTask =flpc.lastLocation
                konumBilgisi()
            }
            else {
                Toast.makeText(applicationContext,"İzin alınmadı.",Toast.LENGTH_SHORT).show()
            }

        }

    }
}