package taydastahsin.com.todoaplication.data.repo

import taydastahsin.com.todoaplication.data.datasource.todoDataSource
import taydastahsin.com.todoaplication.data.entity.todoData

class todoRepository(var tds:todoDataSource) {

    suspend fun dataGoster():List<todoData> =tds.dataGoster()
    suspend fun kaydet(todo_baslik:String,todo_bilgi:String)=tds.kaydet(todo_baslik,todo_bilgi)
    suspend fun guncelle(todo_id:Int,todo_baslik: String,todo_bilgi: String) =tds.guncelle(todo_id,todo_baslik,todo_bilgi)
    suspend fun sil(todo_id: Int) =tds.sil(todo_id)
    suspend fun ara(aramaKelimesi:String): List<todoData> =tds.ara(aramaKelimesi)
}