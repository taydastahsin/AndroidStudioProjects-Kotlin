package taydastahsin.com.navigationcompent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import taydastahsin.com.navigationcompent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)//MainActivite binding e bağladık
        setContentView(binding.root)

        val navHostShow = supportFragmentManager.findFragmentById(R.id.fragmentContainerNav) as NavHostFragment//"fragmentler içinden "fragmentContainerNav" değişkene bağladık

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostShow.navController)// ekranda görmek istediğimiz 2 fragmanı "navigationUI" ile birbirine bağladık.
    }
}