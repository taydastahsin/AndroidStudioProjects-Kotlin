package taydastahsin.com.todoaplication.data.datasource

import taydastahsin.com.todoaplication.data.entity.todoData

class todoDataSource {

    suspend fun kaydet(baslik:String,bilgi:String){}
    suspend fun sil(todoid: String){}
    suspend fun guncelle(todoid:String,baslik:String,bilgi: String){}
    suspend fun ara(girilenbilgi:String){}
}