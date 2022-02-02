package com.example.myapplication.lifeCycleAwareComponent

import android.util.Log
import androidx.lifecycle.Lifecycle.Event
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Event.ON_CREATE)
    fun onCreate() {
        Log.d("TAG", "Observer - ON CREATE")
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    fun onPause() {
        Log.d("TAG", "Observer - ON PAUSE")
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    fun onResume() {
        Log.d("TAG", "Observer - ON RESUME")
    }

    @OnLifecycleEvent(Event.ON_START)
    fun onStart() {
        Log.d("TAG", "Observer - ON START")
    }

    @OnLifecycleEvent(Event.ON_STOP)
    fun onStop() {
        Log.d("TAG", "Observer - ON STOP")
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    fun onDestroy() {
        Log.d("TAG", "Observer - ON DESTROY")
    }
}