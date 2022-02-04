package com.example.myapplication.RetrofitWithCoroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RetrofitWithCoroutineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_with_coroutine)

        val quotesApi = RetrofitHelper.getInstance().create(QuotesAPI::class.java)
        GlobalScope.launch {
            //Completing the api link
            val result = quotesApi.getQuotes(1)
            val quoteList = result.body()
            if (quoteList != null) {
                quoteList.results?.forEach {
                    Log.e("TAG", "Quote: " + it.content)
                }
            }
        }
    }
}