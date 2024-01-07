package taydastahsin.com.filmleruygulamasi.data.entity

import java.io.Serializable

//Uygulamamızda kullandığımız verilerin nasıl oluşmasını istediğimizi belirttik
//Bu sınıfı "navigation" da "Detay" sayfasında "Arguments" yapısında verileri almak için "Serializable" yapısıyla oluşturduk.
data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_resim:String,
                   var film_fiyat:Int):Serializable {
}