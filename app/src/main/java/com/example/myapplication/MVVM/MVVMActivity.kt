package com.example.myapplication.MVVM

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class MVVMActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvmactivity)

        val quoteRepository = (application as QuoteApplication).quoteRepository

        viewModel =
            ViewModelProvider(this, ViewModelFactory(quoteRepository)).get(ViewModel::class.java)

        viewModel.quotes.observe(this, Observer {
            Log.d("Retrofit MVVM", it.results.toString())
            Toast.makeText(applicationContext, it.results.size.toString(), Toast.LENGTH_SHORT)
                .show()
        })


    }
}