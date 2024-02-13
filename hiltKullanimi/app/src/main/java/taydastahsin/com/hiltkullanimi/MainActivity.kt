package taydastahsin.com.hiltkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltkullanimi.R
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kargo.gonderi()
        internet.basvuru()


    }
}