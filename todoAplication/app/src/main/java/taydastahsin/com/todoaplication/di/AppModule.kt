package taydastahsin.com.todoaplication.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import taydastahsin.com.todoaplication.data.datasource.todoDataSource
import taydastahsin.com.todoaplication.data.repo.todoRepository
import taydastahsin.com.todoaplication.room.Veritabanı
import taydastahsin.com.todoaplication.room.todoDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideTodoDataSource(tdao:todoDao):todoDataSource{
        return todoDataSource(tdao)
    }

    @Provides
    @Singleton
    fun provideTodoRepository(tds:todoDataSource):todoRepository{
        return todoRepository(tds)
    }

    @Provides
    @Singleton
    fun provideTodoDao(@ApplicationContext context:Context):todoDao{
        val vt =Room.databaseBuilder(context,Veritabanı::class.java,"todo.db")
            .createFromAsset("todo.db").build()
        return vt.gettodoDao()
    }

}