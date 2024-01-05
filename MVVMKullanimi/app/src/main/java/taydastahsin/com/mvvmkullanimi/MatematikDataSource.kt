package taydastahsin.com.mvvmkullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSource {

    suspend fun ToplamaYap( sayi1Deger:String,sayi2Deger:String ): String =//Yapılcak olan işlemin "suspend fun" şeklinde kurdum.
        // Bizden 2 adet veri girmemizi istedim işlemimizi oluşturmak için.
        // Burda "suspend" olması database kısmında daha kullanışlı olmasıdır.
        withContext(Dispatchers.IO){//Yaptığımız işlemleri "MatematikRepository" aktarmak için kullandığımız "Coroutine" yapısını oluşturdum.
            val sayi1=sayi1Deger.toInt()//Yapmak istediğimiz sayı değerini "INT" türüne dönüştürdük
            val sayi2 =sayi2Deger.toInt()//Yapmak istediğimiz sayı değerini "INT" türüne dönüştürdük

            val toplama=sayi1+sayi2//İşlemimizde ana hedef olan "toplama " işlemini tanımladım
            return@withContext toplama.toString()//İşlem sonucu çıkan değerin "return@withContext" yapısı ile döndürülmesini sağladım.
            //Burda oluşan veriyi "Coroutine" ypaısında tanımlamış olduk ve "Repository" de bu veriyi çekebiliriz.
        }


    suspend fun CarpmaYap(sayi1Deger:String,sayi2Deger:String) :String =//Yapılcak olan işlemin "suspend fun" şeklinde kurdum.
    // Bizden 2 adet veri girmemizi istedim işlemimizi oluşturmak için.
        // Burda "suspend" olması database kısmında daha kullanışlı olmasıdır.
        withContext(Dispatchers.IO){//Yaptığımız işlemleri "MatematikRepository" aktarmak için kullandığımız "Coroutine" yapısını oluşturdum.
            val sayi1=sayi1Deger.toInt()//Yapmak istediğimiz sayı değerini "INT" türüne dönüştürdük
            val sayi2 =sayi2Deger.toInt()//Yapmak istediğimiz sayı değerini "INT" türüne dönüştürdük

            val carpma=sayi1*sayi2//İşlemimizde ana hedef olan "toplama " işlemini tanımladım
            return@withContext carpma.toString()//İşlem sonucu çıkan değerin "return@withContext" yapısı ile döndürülmesini sağladım.
            //Burda oluşan veriyi "Coroutine" ypaısında tanımlamış olduk ve "Repository" de bu veriyi çekebiliriz.
        }

}