package taydastahsin.com.todoaplication.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "todo")
data class todoData(@PrimaryKey(autoGenerate = true)
                   @ColumnInfo(name = "todo_id") @NotNull var todo_id:Int,
                   @ColumnInfo(name = "todo_baslik") @NotNull var todo_baslik:String,
                   @ColumnInfo(name = "todo_bilgi")@NotNull var todo_bilgi:String) : Serializable {
}