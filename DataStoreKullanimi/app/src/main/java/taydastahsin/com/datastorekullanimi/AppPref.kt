package taydastahsin.com.datastorekullanimi

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(var context:Context) {

    val Context.ds : DataStore<Preferences> by preferencesDataStore("Bilgiler")

    companion object{
        val Ad_Key = stringPreferencesKey("Ad")
        val Soyad_Key = stringPreferencesKey("Soyad")
        val Yas_Key = intPreferencesKey("Yaş")
        val Boy_Key = doublePreferencesKey("Boy")
        val Bekar_Key = booleanPreferencesKey("Bekar")
        val Liste_Key = stringSetPreferencesKey("Liste")

    }

    suspend fun adKaydet(ad:String){
        context.ds.edit {
            it[Ad_Key]=ad
        }

    }
    suspend fun adGoster() :String{
        var goster =context.ds.data.first()
        return goster[Ad_Key] ?: "isim yok"
    }
    suspend fun adSil(){
        context.ds.edit {
            it.remove(Ad_Key)
        }
    }

    ////////////////////////////////////////////////////////////////

    suspend fun soyadKaydet(soyad:String){
        context.ds.edit {
            it[Soyad_Key] =soyad
        }
    }

    suspend fun soyadGoster():String{
        val goster =context.ds.data.first()
        return goster[Soyad_Key] ?:"soyad yok"
    }

    suspend fun soyadSil(){
        context.ds.edit {
            it.remove(Soyad_Key)
        }
    }

    ///////////////////////////////////////////////////////////////////

    suspend fun yasKaydet(yas:Int){

        context.ds.edit {
            it[Yas_Key]=yas
        }
    }

    suspend fun yasGoster():Int{
        val goster = context.ds.data.first()
        return goster[Yas_Key] ?: 0
    }

    suspend fun yasSil(){
        context.ds.edit {
            it.remove(Yas_Key)
        }
    }

    /////////////////////////////////////////////////////////////////////

    suspend fun boyKaydet(boy:Double){
        context.ds.edit {
             it[Boy_Key]=boy
        }
    }

    suspend fun boyGoster():Double{
        val goster=context.ds.data.first()
        return goster[Boy_Key] ?: 0.0
    }

    suspend fun boySil(){
        context.ds.edit {
            it.remove(Boy_Key)
        }
    }

    ///////////////////////////////////////////////////////////////////////

    suspend fun bekarKaydet(bekar:Boolean){
        context.ds.edit {
            it[Bekar_Key]=false
        }
    }

    suspend fun bekarGoster():Boolean{
        val goster =context.ds.data.first()
        return goster[Bekar_Key] ?:false
    }

    suspend fun bekarSil(){
        context.ds.edit {
            it.remove(Bekar_Key)
        }
    }

    ///////////////////////////////////////////////////////////////////////

    suspend fun listeKaydet(liste:Set<String>){
        context.ds.edit {
            it[Liste_Key]=liste
        }
    }

    suspend fun listeGoster():Set<String>?{
        val goster =context.ds.data.first()
        return goster[Liste_Key]

    }

    suspend fun listeSil(){
        context.ds.edit {
            it.remove(Liste_Key)
        }
    }
}