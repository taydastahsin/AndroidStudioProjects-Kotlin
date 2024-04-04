package taydastahsin.com.get_setkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var k =Kare()

        k.kareUzunluk= 150f
        println(k.kareUzunluk)
        println(k.Cevre)

    }
}

class Kare {

    var kareUzunluk :Float = 0f
        get() {
            return field
        }
        set(value) {
            if (value>0){
                field=value
            }
            else println("Kare uzunluğu 0'dan büyük olmalıdır.")
        }

    var Cevre:Float = 0f
        get() {
            return kareUzunluk *4
        }
        private set

}