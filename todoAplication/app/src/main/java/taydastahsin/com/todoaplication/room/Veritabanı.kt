package taydastahsin.com.todoaplication.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [todoDao::class], version = 1)
abstract class Veritabanı :RoomDatabase() {
    abstract  fun gettodoDao ():todoDao
}