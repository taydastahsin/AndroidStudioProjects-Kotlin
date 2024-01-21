package com.example.filmlerapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "filmler")
data class Filmler(@PrimaryKey(autoGenerate = true)
                   @ColumnInfo(name = "film_id") @NotNull var id:Int,
                   @ColumnInfo(name = "film_ad") @NotNull var ad:String,
                   @ColumnInfo(name = "film_resim") @NotNull var resim:String,
                   @ColumnInfo(name = "film_fiyat") @NotNull var fiyat:Int) : Serializable {
}