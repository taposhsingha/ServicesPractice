package com.example.servicespractice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log


class MyBackgroundService:Service() {
    init {
        Log.i("MYTAG","SERVICE HAS BEEN CREATED")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MYTAG","Service started")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        Log.i("MYTAG","Destroying...")
        super.onDestroy()
    }
}