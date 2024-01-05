package taydastahsin.com.mvvmkullanimi

class MatematikRepository {

    val mds=MatematikDataSource()//"MatematikDataSource" sınıfına erişebilmek için değişken tanımladım.

    suspend fun ToplamaYap( sayi1Deger:String,sayi2Deger:String ): String{//Yapmak istediğim işlemleri fonksiyonel olarak tanımalyıp,
        // oluşturduğumuz değişkene değer aktarımı sağladım.
        return mds.ToplamaYap(sayi1Deger,sayi2Deger)//Oluşturduğum "mds" değişkeni ile "MatematikDataSource"a erişim sağlayıp ordaki fonksiyonları aktif hale getirdim.

    }

    suspend fun CarpmaYap(sayi1Deger:String,sayi2Deger:String) :String{//Yapmak istediğim işlemleri fonksiyonel olarak tanımalyıp,
        // oluşturduğumuz değişkene değer aktarımı sağladım.
        return  mds.CarpmaYap(sayi1Deger,sayi2Deger)//Oluşturduğum "mds" değişkeni ile "MatematikDataSource"a erişim sağlayıp ordaki fonksiyonları aktif hale getirdim.
    }
}