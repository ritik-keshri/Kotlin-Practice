package com.example.myapplication.mvvmWithRoomDatabase

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val quoteRepository: QuoteRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel(quoteRepository) as T
    }
}