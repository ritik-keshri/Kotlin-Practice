package com.example.myapplication.BroadcastReceiver

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityBroadcastReceiverBinding

class BroadcastReceiver : AppCompatActivity() {

    lateinit var binding: ActivityBroadcastReceiverBinding
    lateinit var batteryReceiver: BatteryReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBroadcastReceiverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        batteryReceiver = BatteryReceiver(binding.text)
        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(batteryReceiver)
    }
}