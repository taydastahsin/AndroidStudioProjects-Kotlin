package taydastahsin.com.asyncexample

import android.os.AsyncTask
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("Async öncesi")
        Hesapla{sonuc(it)}.execute()
        println("Async sonrası")
    }

    fun sonuc(toplam:Long){
        println("Toplam : ${toplam}")
    }
}

class Hesapla(var sonucFonk : (Long)->Unit): AsyncTask<Void, Void, Long>() {

    var toplam:Long =0

    override fun doInBackground(vararg params: Void?): Long {

        for (i in 1..1000000){
            toplam +=i
        }
        return toplam
    }

    override fun onPostExecute(result: Long) {
        super.onPostExecute(result)

        sonucFonk(result)
    }

}