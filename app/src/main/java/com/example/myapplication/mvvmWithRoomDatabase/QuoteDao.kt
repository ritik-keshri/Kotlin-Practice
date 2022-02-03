package com.example.myapplication.mvvmWithRoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {

    @Insert
    suspend fun addQuote(quote: Quote)

    @Query("select * from quote")
    fun getQuote(): LiveData<List<Quote>>
}