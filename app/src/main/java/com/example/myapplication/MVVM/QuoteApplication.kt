package com.example.myapplication.MVVM

import android.app.Application

class QuoteApplication : Application() {

    lateinit var quoteRepository: QuoteRepository

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
        val quoteDatabase=QuoteDatabase.getDatabase(applicationContext)
         quoteRepository = QuoteRepository(quoteService,quoteDatabase,applicationContext)
    }
}