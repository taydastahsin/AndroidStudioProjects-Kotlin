package com.example.filmlerapp.retrofit

import com.example.filmlerapp.data.entity.FilmlerCevap
import retrofit2.http.GET

interface FilmlerDAO {
    @GET("filmler_yeni/tum_filmler.php")
    suspend fun filmleriYukle():FilmlerCevap
}