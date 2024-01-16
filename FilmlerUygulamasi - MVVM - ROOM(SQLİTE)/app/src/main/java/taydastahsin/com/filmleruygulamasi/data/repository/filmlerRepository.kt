package taydastahsin.com.filmleruygulamasi.data.repository

import android.view.View
import androidx.lifecycle.ViewModel
import taydastahsin.com.filmleruygulamasi.data.datasource.filmlerDataSource
import taydastahsin.com.filmleruygulamasi.data.entity.Filmler

class filmlerRepository{
    var fds=filmlerDataSource()

    suspend fun dataGet():List<Filmler> =fds.dataGet()

}