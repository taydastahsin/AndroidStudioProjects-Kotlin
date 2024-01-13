package taydastahsin.com.basitsayacapp

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import java.util.prefs.Preferences

class AppPref(var context:Context) {
val Context.ds :DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore("Bilgiler")

    companion object{
        val sayac_No = intPreferencesKey("Sayac")

    }
    suspend fun sayacKaydet(sayac:Int){
        context.ds.edit {
            it[sayac_No] =sayac
        }
    }

    suspend fun sayacGoster():Int{
        val gelen =context.ds.data.first()
        return gelen[sayac_No] ?:0
    }
}