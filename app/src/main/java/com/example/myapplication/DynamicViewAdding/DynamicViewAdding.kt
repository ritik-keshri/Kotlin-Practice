package com.example.myapplication.DynamicViewAdding

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_dynamic_view_adding.*

class DynamicViewAdding : AppCompatActivity() {
    lateinit var layout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_adding)

        layout = findViewById(R.id.linearLayout)

        addView.setOnClickListener {
            addView()
        }
    }

    private fun addView() {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view:View = inflater.inflate(R.layout.dynamic_view_layout,null)
        layout.addView(view)
    }
}