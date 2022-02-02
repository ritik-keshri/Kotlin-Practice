package com.example.myapplication.viewModel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        //For View Model
        //ViewModelProvider parameter uses the owner of the ViewModel class which is the context that is using it and get is used to combine viewModel Class
//        val viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        //For View Model Factory
        val viewModel = ViewModelProvider(this,ViewModelFactory(10)).get(ViewModel::class.java)

        textView3.text = viewModel.number.toString()

        addBtn.setOnClickListener {
            viewModel.addNumber()
            textView3.text =viewModel.number.toString()
        }
    }
}