package taydastahsin.com.filmleruygulamasi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import taydastahsin.com.filmleruygulamasi.R
import taydastahsin.com.filmleruygulamasi.databinding.FragmentDetayBinding


class DetayFragment : Fragment() { //Anasayfada seçtiğimiz verilerin detaylı görünümü için kullandığımız fragment
    private lateinit var binding: FragmentDetayBinding //Fragment'ın içindeki araçları kullanmak için oluşturduk.

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentDetayBinding.inflate(inflater, container, false) //"bindding" yapısına fragment'i entegre ettik

        val bundle:DetayFragmentArgs by navArgs() //Anasayfadan detay sayfasına veri aktarımı için kurduğumuz yöntem
        val film =bundle.film //Gelen verileri düzgün bir şekilde kullanmak için tanımladığımız değişken

        binding.toolbarDetay.title=film.film_ad //Toolbarımıza "film" değişkeninden çektiğimiz "film_ad" verisini yazdırdık.

        // Resim kutusunda gösterilcek resmin yerini gösterdiğimiz yöntem
        //İlk önce resmin adını sınıfımızdan çektik sonra resmin bulunduğu "drawable" klasörünü gösterdik en sonda yapısını belirttik.
        binding.imageView.setImageResource(resources.getIdentifier(film.film_resim,"drawable",requireContext().packageName))
        binding.textViewFiyat.text="${film.film_fiyat} TL"//Sayfamızda bulunan "textview" yapısına film nesnemizin fiyat bilgisini yazdırdık.



        return binding.root
    }


}