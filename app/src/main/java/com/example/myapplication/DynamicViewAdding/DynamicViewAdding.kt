package com.example.myapplication.DynamicViewAdding

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_dynamic_view_adding.*

class DynamicViewAdding : AppCompatActivity() {

    lateinit var layout: LinearLayout
    var languageList = ArrayList<String>()
    lateinit var editText: EditText
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_adding)

        layout = findViewById(R.id.linearLayout)

        addView.setOnClickListener {
            if (txt.text.isNullOrEmpty()) {
                txt.error = "Invalid Data"
            } else {
                if (i == 0) {
                    addView()
                    i=i.plus(1)
                } else {
                    if (editText.text.isNullOrEmpty()) {
                        editText.error = "Invalid Data"
                    } else {
                        addView()
                    }
                }
            }
        }

        showData.setOnClickListener {
//            savedata()
            showDa()
//            languageList.clear()
        }
    }

    private fun showDa() {
//        val count = linearLayout.childCount
//        for (i in 0 until count) {
//            Toast.makeText(this, "Language at $i is $languageList[i] ", Toast.LENGTH_SHORT).show()
//        }
        languageList.add(0, txt.text.toString())
        val count = linearLayout.childCount
        var v: View?
        for (i in 0 until count) {
            v = linearLayout.getChildAt(i)
            val languageName: EditText = v.findViewById(R.id.na)
            languageList.add(languageName.text.toString())
        }
        Log.d("TAG", "showDa: $languageList")
    }

    private fun addView() {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.dynamic_view_layout, null)
        layout.addView(view)

        var edit = view.findViewById<EditText>(R.id.na)
        editText = edit

//        var v=linearLayout.getChildAt(int)
//        val languageName: EditText = v.findViewById(R.id.na)
//        languageList.add(languageName.text.toString())
//        Log.d("TAG", "Add: $int "+languageName.text.toString())
    }

//    fun savedata() {
//        val count = linearLayout.childCount
//        var v: View?
//        for (i in 0 until count) {
//            v = linearLayout.getChildAt(i)
//            val languageName: EditText = v.findViewById(R.id.na)
//            // add the data to arraylist
//            languageList.add(languageName.text.toString())
//        }
//    }
}
