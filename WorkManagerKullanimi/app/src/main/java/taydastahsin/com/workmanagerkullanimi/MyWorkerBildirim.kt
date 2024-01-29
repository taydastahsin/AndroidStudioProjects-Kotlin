package taydastahsin.com.workmanagerkullanimi

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorkerBildirim(appContext: Context, workerParameters: WorkerParameters):
    Worker(appContext,workerParameters) {
    override fun doWork(): Result {

        bildirimOlustur()
        return Result.success()

    }

    private fun bildirimOlustur() {
        val builder:NotificationCompat.Builder
        val bildirimYoneticisi = applicationContext
            .getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager

        val intent =Intent(applicationContext,MainActivity::class.java)
        val gidilecekIntent = PendingIntent
            .getActivity(applicationContext,1,intent,PendingIntent.FLAG_UPDATE_CURRENT or  PendingIntent.FLAG_IMMUTABLE)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){//Yeni sürümlerde çalışcak
            val kanalId="kanalId"
            val kanalAd ="kanalAd"
            val kanalTanitim ="kanalTanıtım"
            val kanalOnceligi =NotificationManager.IMPORTANCE_HIGH

            var kanal :NotificationChannel?= bildirimYoneticisi.getNotificationChannel(kanalId)
            if (kanal ==null){
                kanal =NotificationChannel(kanalId,kanalAd,kanalOnceligi)
                kanal.description =kanalTanitim
                bildirimYoneticisi.createNotificationChannel(kanal)
            }
            builder =NotificationCompat.Builder(applicationContext,kanalId)
            builder.setContentTitle("Başlık")
                .setContentText("İçerik")
                .setSmallIcon(R.drawable.resim)
                .setContentIntent(gidilecekIntent)
                .setAutoCancel(true)


        }
        else{//Eski sürümde çalışcak (OREO sürümü)
            builder =NotificationCompat.Builder(applicationContext)
            builder.setContentTitle("Başlık")
                .setContentText("İçerik")
                .setSmallIcon(R.drawable.resim)
                .setContentIntent(gidilecekIntent)
                .setAutoCancel(true)
                .priority =Notification.PRIORITY_HIGH
        }
        bildirimYoneticisi.notify(1,builder.build())
    }
}