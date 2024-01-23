package com.example.filmlerapp.retrofit

import retrofit2.Retrofit

class ApiUtil {
    companion object{
        val BASE_URL="http://kasimadalan.pe.hu/"
        fun getFilmlerDAO() :FilmlerDAO{
            return RetrofitClient.getClient(BASE_URL).create(FilmlerDAO::class.java)
        }
    }
}