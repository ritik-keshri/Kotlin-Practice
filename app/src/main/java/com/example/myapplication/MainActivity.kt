package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Retrofit.Retrofit
import com.example.myapplication.firebase.Firebase
import com.example.myapplication.fragmentLifecycle.FragmentLifecycle
import com.example.myapplication.layoutManager.RecyclerView
import com.example.myapplication.listView.ListView
import com.example.myapplication.livedata.LiveDataActivity
import com.example.myapplication.viewModel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: ")

        mssg.setOnClickListener {
            val msg: String = userMsg.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("msg", msg)
            startActivity(intent)
        }

        share.setOnClickListener {
            val msg: String = userMsg.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to :"))
        }

        layoutManager.setOnClickListener {
            intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }

        fragment_lifecycle.setOnClickListener {
            intent = Intent(this, FragmentLifecycle::class.java)
            startActivity(intent)
        }

        listview.setOnClickListener {
            intent = Intent(this, ListView::class.java)
            startActivity(intent)
        }

        firebase.setOnClickListener {
            intent = Intent(this, Firebase::class.java)
            startActivity(intent)
        }

        retrofit.setOnClickListener {
            intent = Intent(this, Retrofit::class.java)
            startActivity(intent)
        }

        viewModel.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }

        liveData.setOnClickListener {
            startActivity(Intent(this, LiveDataActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: ")
    }
}