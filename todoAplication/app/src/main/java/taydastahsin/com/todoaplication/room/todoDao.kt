package taydastahsin.com.todoaplication.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import taydastahsin.com.todoaplication.data.entity.todoData

@Dao
interface todoDao {
    @Query("SELECT * FROM todo ")
    suspend fun dataGoster():List<todoData>

    @Insert
    suspend fun dataKaydet(data:todoData)

    @Update
    suspend fun dataGuncelle(data:todoData)

    @Delete
    suspend fun dataSil(data:todoData)

    @Query("SELECT * FROM todo WHERE todo_baslik like '%' ||:aramaKelimesi || '%'")
    suspend fun ara(aramaKelimesi:String):List<todoData>


}