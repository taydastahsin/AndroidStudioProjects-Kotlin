package taydastahsin.com.filmleruygulamasi.data.entity

import java.io.Serializable

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_resim:String,
                   var film_fiyat:String):Serializable {
}