package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MVVM.MVVMActivity
import com.example.myapplication.MVVMWithRetrofit.MVVMWithRetrofit
import com.example.myapplication.Retrofit.Retrofit
import com.example.myapplication.RetrofitWithCoroutines.RetrofitWithCoroutineActivity
import com.example.myapplication.animation.Animation
import com.example.myapplication.firebase.Firebase
import com.example.myapplication.fragmentLifecycle.FragmentLifecycle
import com.example.myapplication.layoutManager.RecyclerView
import com.example.myapplication.lifeCycleAwareComponent.LifeCycleAwareActivity
import com.example.myapplication.listAdapter.ListAdapter
import com.example.myapplication.listView.ListView
import com.example.myapplication.livedata.LiveDataActivity
import com.example.myapplication.mvvmWithRoomDatabase.MVVM
import com.example.myapplication.roomDatabase.RoomDatabaseActivity
import com.example.myapplication.viewModel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.e(TAG, "onCreate: ")

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

        lifeCycleAware.setOnClickListener {
            startActivity(Intent(this, LifeCycleAwareActivity::class.java))
        }

        roomDatabase.setOnClickListener {
            startActivity(Intent(this, RoomDatabaseActivity::class.java))
        }

        mvvmWithRoomDb.setOnClickListener {
            startActivity(Intent(this, MVVM::class.java))
        }

        listAdapter.setOnClickListener {
            startActivity(Intent(this, ListAdapter::class.java))
        }

        retrofitWithCoroutine.setOnClickListener {
            startActivity(Intent(this, RetrofitWithCoroutineActivity::class.java))
        }

        mvvmWithRetrofit.setOnClickListener {
            startActivity(Intent(this, MVVMWithRetrofit::class.java))
        }

        mvvm.setOnClickListener {
            startActivity(Intent(this, MVVMActivity::class.java))
        }

        animation.setOnClickListener{
            startActivity(Intent(this, Animation::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: Activity")
    }
}