package com.example.myapplication.lifeCycleAwareComponent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class LifeCycleAwareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle_aware)

        lifecycle.addObserver(Observer())
        Log.d("TAG", "ACTIVITY - ON CREATE")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "ACTIVITY - ON RESUME")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "ACTIVITY - ON START")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "ACTIVITY - ON PAUSE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "ACTIVITY - ON DESTROY")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "ACTIVITY - ON STOP")
    }
}