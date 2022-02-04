package com.example.myapplication.MVVMWithRetrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class MVVMWithRetrofit : AppCompatActivity() {

    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvmwith_retrofit)

        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
        val quoteRepository = QuoteRepository(quoteService)

        viewModel =
            ViewModelProvider(this, ViewModelFactory(quoteRepository)).get(ViewModel::class.java)

        viewModel.quotes.observe(this, Observer {
            Log.d("Retrofit MVVM", it.results.toString())
        })
    }
}