package com.example.myapplication.mvvmWithRoomDatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote: Quote) {
        //viewModelScope.launch is use to launch the coroutine and Dispatchers.IO is use because it is IO operation.
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.addQuote(quote)
        }
    }

    fun getQuote(): LiveData<List<Quote>> {
        return quoteRepository.getQuote()
    }
}