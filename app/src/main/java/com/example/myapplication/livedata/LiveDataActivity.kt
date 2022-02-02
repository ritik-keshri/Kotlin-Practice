package com.example.myapplication.livedata

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        val viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        viewModel.seconds().observe(this, Observer {
            time.text = it.toString()
        })

        viewModel.finished.observe(this, Observer {
            if (it) {
                Toast.makeText(this, "Finished!!!", Toast.LENGTH_SHORT).show()
            }
        })

        start.setOnClickListener {
            if (maxTime.text.length<4 || maxTime.text.isEmpty()){
                Toast.makeText(this,"Invalid Time",Toast.LENGTH_SHORT).show()
            }
            else {
                viewModel.time.value = maxTime.text.toString().toLong()
                viewModel.startTimer()
            }
        }

        stop.setOnClickListener {
            viewModel.stopTimer()
        }
    }
}