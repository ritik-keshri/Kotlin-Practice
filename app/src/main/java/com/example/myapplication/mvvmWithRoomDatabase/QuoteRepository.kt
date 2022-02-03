package com.example.myapplication.mvvmWithRoomDatabase

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao: QuoteDao) {

    suspend fun addQuote(quote: Quote) {
        return quoteDao.addQuote(quote)
    }

    fun getQuote(): LiveData<List<Quote>> {
        return quoteDao.getQuote()
    }
}