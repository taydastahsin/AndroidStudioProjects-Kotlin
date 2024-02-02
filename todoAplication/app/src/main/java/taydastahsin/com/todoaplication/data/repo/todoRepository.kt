package taydastahsin.com.todoaplication.data.repo

import taydastahsin.com.todoaplication.data.datasource.todoDataSource
import taydastahsin.com.todoaplication.data.entity.todoData

class todoRepository() {
    var tds=todoDataSource()

    suspend fun kaydet(baslik:String,bilgi:String)=tds.kaydet(baslik,bilgi)
    suspend fun sil(todoid: String)=tds.sil(todoid)
    suspend fun guncelle(todoid:String,baslik:String,bilgi: String)=tds.guncelle(todoid,baslik,bilgi)
    suspend fun ara(girilenbilgi:String)=tds.ara(girilenbilgi)
}