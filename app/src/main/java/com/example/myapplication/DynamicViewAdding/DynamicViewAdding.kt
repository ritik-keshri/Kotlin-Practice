package com.example.myapplication.DynamicViewAdding

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_dynamic_view_adding.*

class DynamicViewAdding : AppCompatActivity() {
    lateinit var layout: LinearLayout
    var languageList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_adding)

        layout = findViewById(R.id.linearLayout)

        addView.setOnClickListener {
            addView()
        }
        showData.setOnClickListener {
            savedata()
            showDa()
        }
    }

    private fun showDa() {
        val count = linearLayout.childCount
        for (i in 0 until count) {
            Toast.makeText(this, "Language at $i is $languageList[i] ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun addView() {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.dynamic_view_layout, null)
        layout.addView(view)

        val languageName: EditText = view.findViewById(R.id.na)
        languageList.add(languageName.text.toString())
    }

    fun savedata() {
        val count = linearLayout.childCount
        var v: View?
        for (i in 0 until count) {
            v = linearLayout.getChildAt(i)
            val languageName: EditText = v.findViewById(R.id.na)
            // add the data to arraylist
            languageList.add(languageName.text.toString())
        }

    }
}
