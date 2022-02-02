package com.example.myapplication.livedata

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    var time = MutableLiveData<Long>()
    private lateinit var timer: CountDownTimer
    private var second = MutableLiveData<Int>()
    var finished = MutableLiveData<Boolean>()

    fun seconds(): MutableLiveData<Int> {
        return second
    }

    fun startTimer() {
        timer = object : CountDownTimer(time.value!!.toInt().toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished / 1000
                second.value = timeLeft.toInt()
            }

            override fun onFinish() {
                finished.value = true
            }
        }.start()
    }

    fun stopTimer() {
        timer.cancel()
    }
}