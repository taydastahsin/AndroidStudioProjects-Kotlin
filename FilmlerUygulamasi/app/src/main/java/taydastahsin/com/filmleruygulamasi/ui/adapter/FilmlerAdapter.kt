package taydastahsin.com.filmleruygulamasi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler
import taydastahsin.com.filmleruygulamasi.databinding.CardTasarimBinding
import taydastahsin.com.filmleruygulamasi.databinding.FragmentAnasayfaBinding
import taydastahsin.com.filmleruygulamasi.ui.fragment.AnasayfaFragmentDirections

//Tasarladığımız "Layout" tasarımımızın kontrolünü sağlamak için kurduğumuz sınıf
class FilmlerAdapter(var mcontext :Context,var filmListesi:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.cardTasarim>() {
    //Sınıfımızda yapının "MainActivity" nin içinde olduğumuzu tanımlamak için "mcontext" belirledik
    //Sınıfın içinden bilgi daracığı oluşturmak içinse "filmListesi" list yapısında oluşturduk.
    //Oluşturduğumuz yapının "RecyckerView.Adapter" bağlayarak oluşturduğumuz "Layout" kullanmayı sağladık.

    //Oluşturduğumuz "Layout" tasarımımızın içindeki araçları kullanmak için "binding" yapısını oluşturduk.
    inner class cardTasarim(var tasarim :CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)
    //"inner class" yapısını oluşturduğumuzda bize 3 adet kullancağımız yapı veriyor.

    //Tasarımızın içindeki araçalra erişmemiz için "binding" yapısını oluşturduğumuz yapı
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarim {
       val  binding = CardTasarimBinding.inflate(LayoutInflater.from(mcontext), parent, false)
        return cardTasarim(binding)
    }

    //Tasarımızdaki araçları kontrol edebilmek için kullandığımız yapı
    override fun onBindViewHolder(holder: cardTasarim, position: Int) {
        val filmV = filmListesi.get(position)//Sınıfın içinde tanımladığımız diziyi tanımladık
        val t =holder.tasarim//tasarımızdaki araçları kullanmak için kurduğumuz "binding"
        // yapısı burda "holder" olarak tanımlı bunu "t" değişkenine tanımladık.

        //resim için kullandığımız araca resmin yolunu gösteriyoruz.
        t.imageViewResim.setImageResource(mcontext.resources.getIdentifier(filmV.film_resim,"drawable",mcontext.packageName))
        t.textViewFiyat.text="${filmV.film_fiyat} TL" //Tasarımımız içindeki fiyat text'ine "filmV" den fiyat bilgisini aldık.

        t.imageViewResim.setOnClickListener{//Tasarımızdaki resme tıklandığında ne yapılcağını belirlemek için kulllanılır.

            //Resme tıklandığında oluşturduğumuz "DetayFragment" sayfasına geçişini tanımaldık
            val gecis = AnasayfaFragmentDirections.anasayfaDetayGecis(film = filmV)
            Navigation.findNavController(it).navigate(gecis)

        }

        t.buttonSepet.setOnClickListener{//Tasarımızdaki butona tıklandığında kullandığımız yapı
            //Ekrana geçici süre ile bilgi vermesi için kullandğımız "Snackbar" yöntemidir.
            Snackbar.make(it,"${filmV.film_ad} sepete eklendi.",Snackbar.LENGTH_LONG).show()
        }

    }

    //Yapımızın içindeki "Recycler" içinde kaç adet atasarımımız olmasını istediğimizi tanımlıdığımız yapı
    override fun getItemCount(): Int {
       return filmListesi.size
    }
}