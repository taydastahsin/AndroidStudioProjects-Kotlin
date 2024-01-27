package taydastahsin.com.workmanagerkullanimi

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext:Context,workerParameters: WorkerParameters):Worker(appContext,workerParameters) {
    override fun doWork(): Result {
        val toplam = 5+10
        Log.e("Arka Plan Sonucu",toplam.toString())
        return Result.success()

    }
}