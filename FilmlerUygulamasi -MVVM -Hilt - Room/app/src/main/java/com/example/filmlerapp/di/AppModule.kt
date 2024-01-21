package com.example.filmlerapp.di

import android.content.Context
import androidx.room.Room
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepository
import com.example.filmlerapp.room.FilmlerDao
import com.example.filmlerapp.room.Veritabanı
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource(fdao:FilmlerDao) : FilmlerDataSource {
        return FilmlerDataSource(fdao)
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds:FilmlerDataSource) : FilmlerRepository {
        return FilmlerRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFilmlerDao(@ApplicationContext context: Context) : FilmlerDao {
        val vt =Room.databaseBuilder(context,Veritabanı::class.java,"filmler.db").
        createFromAsset("filmler.db").build()
        return vt.getFilmlerDao()
    }


}