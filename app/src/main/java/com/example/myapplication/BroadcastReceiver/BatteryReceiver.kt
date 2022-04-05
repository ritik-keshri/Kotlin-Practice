package com.example.myapplication.BroadcastReceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class BatteryReceiver(tv: TextView): BroadcastReceiver() {

    var tv: TextView = tv

    override fun onReceive(context: Context?, intent: Intent?) {
        var percentage = intent!!.getIntExtra("level",0)
        if (percentage!=0){
            tv.setText("$percentage%")
        }
    }
}