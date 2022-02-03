package com.example.myapplication.mvvmWithRoomDatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMvvmBinding

class MVVM : AppCompatActivity() {
    private lateinit var binding: ActivityMvvmBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)

        //We get the instance of view model by view model factory like this 3 lines of code
        val dao = QuoteDatabase.getDatabase(this).quoteDao()
        val repository = QuoteRepository(dao)
        viewModel = ViewModelProvider(this, ViewModelFactory(repository)).get(ViewModel::class.java)

        viewModel.getQuote().observe(this, Observer {
            binding.quotes = it.toString()
        })

        binding.addQuote.setOnClickListener {
            val quote = Quote(0, "This is Testing", "Testing")
            viewModel.addQuote(quote)
        }
    }
}