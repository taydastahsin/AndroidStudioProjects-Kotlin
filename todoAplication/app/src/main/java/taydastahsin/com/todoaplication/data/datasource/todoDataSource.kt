package taydastahsin.com.todoaplication.data.datasource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import taydastahsin.com.todoaplication.data.entity.todoData
import taydastahsin.com.todoaplication.room.todoDao

class todoDataSource(var tdao:todoDao) {

    suspend fun dataGoster():List<todoData> = withContext(Dispatchers.IO){
        return@withContext tdao.dataGoster()
    }
    suspend fun kaydet(todo_baslik:String,todo_bilgi:String){
        val newData =todoData(0,todo_baslik,todo_bilgi)
        tdao.dataKaydet(newData)
    }
    suspend fun guncelle(todo_id:Int,todo_baslik: String,todo_bilgi: String){
        val dataUpdate=todoData(todo_id,todo_baslik,todo_bilgi)
        tdao.dataGuncelle(dataUpdate)
    }
    suspend fun sil(todo_id: Int){
        val dataDelete=todoData( todo_id,"","")
        tdao.dataSil(dataDelete)
    }
    suspend fun ara(aramaKelimesi:String): List<todoData> = withContext(Dispatchers.IO){
        return@withContext tdao.ara(aramaKelimesi)
    }
}