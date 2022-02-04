package com.example.myapplication.MVVM

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {

    @Insert
    suspend fun addQuote(quotes: List<Result>)

    @Query("select * from quote")
    suspend fun getQuotes(): List<Result>
}