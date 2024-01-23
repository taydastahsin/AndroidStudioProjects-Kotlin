package com.example.filmlerapp.di

import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.repo.FilmlerRepository
import com.example.filmlerapp.retrofit.ApiUtil
import com.example.filmlerapp.retrofit.FilmlerDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource(fdao:FilmlerDAO) : FilmlerDataSource {
        return FilmlerDataSource(fdao)
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds:FilmlerDataSource) : FilmlerRepository {
        return FilmlerRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFilmlerDAO() : FilmlerDAO {
        return ApiUtil.getFilmlerDAO()
    }
}