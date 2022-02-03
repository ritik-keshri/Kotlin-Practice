package com.example.myapplication.listView

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView: ListView = findViewById(R.id.list)
        val names = arrayOf("hjdsjhb", "hjdsjhb", "hjdsjhb", "hjdsjhb", "hjdsjhb")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, names)

        listView.setOnItemClickListener { _, _, _, _ ->
            Toast.makeText(applicationContext, "askjsd", Toast.LENGTH_SHORT).show()
        }
    }
}