package com.example.labactivity

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Timeservice : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null) {
            runTimer(intent.getIntExtra("value",0))
        }
        return super.onStartCommand(intent, flags, startId)
    }

    fun runTimer(startvalue : Int){
        Thread{
            repeat(startvalue){
                Log.d("countdown",(100-it).toString())
                Thread.sleep(1000)
            }
        }.start()

    }


}



