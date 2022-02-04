package com.example.myapplication.listAdapter

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ListAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_adapter)

        val recyclerView = findViewById<RecyclerView>(R.id.programmingListRecyclerView)

        val adapter = ProgrammingAdapter()
        val p1 = ProgrammingItemDataClass(1, "J", "Java")
        val p2 = ProgrammingItemDataClass(2, "P", "Python")
        val p3 = ProgrammingItemDataClass(3, "K", "Kotlin")
        val p4 = ProgrammingItemDataClass(4, "A", "Android")
        adapter.submitList(listOf(p1, p2, p3, p4))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val p2 = ProgrammingItemDataClass(2, "F", "Flutter")
            val p3 = ProgrammingItemDataClass(3, "K", "Kotlin")
            val p4 = ProgrammingItemDataClass(4, "A", "Android")
            val p5 = ProgrammingItemDataClass(5, "A", "Android Studio")
            val p6 = ProgrammingItemDataClass(6, "R", "Room Database")

            adapter.submitList(listOf(p2,p3,p4      ,p5,p6))
        },4000)
    }
}