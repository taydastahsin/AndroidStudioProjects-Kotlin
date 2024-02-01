package taydastahsin.com.haritakullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import taydastahsin.com.haritakullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnMapReadyCallback {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mMap :GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.buttonHarita.setOnClickListener {
            val konum = LatLng(41.0361566, 28.9854576)
            mMap.addMarker(MarkerOptions().position(konum).title("Konum"))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,15f))
            mMap.mapType =GoogleMap.MAP_TYPE_SATELLITE
        }


    }

    override fun onMapReady(p0: GoogleMap) {
       mMap = p0
        val konum = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions()
            .position(konum)
            .title("Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(konum))
    }
}