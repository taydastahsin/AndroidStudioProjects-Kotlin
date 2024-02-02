package taydastahsin.com.todoaplication.di

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
    suspend fun kaydet():String{
        return ""
    }

    @Provides
    @Singleton
    suspend fun sil():String{
        return ""
    }

    @Provides
    @Singleton
    suspend fun guncelle():String{
        return ""
    }

    @Provides
    @Singleton
    suspend fun ara():String{
        return ""
    }


}