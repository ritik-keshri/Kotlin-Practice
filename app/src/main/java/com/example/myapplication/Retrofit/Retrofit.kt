package com.example.myapplication.Retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Retrofit : AppCompatActivity() {

    lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        getNews()
    }

    private fun getNews() {
        val news = NewsService.newsInstance.getHeadlines("in", 1)
        news.enqueue(object : Callback<NewsDataClass> {
            override fun onResponse(call: Call<NewsDataClass>, response: Response<NewsDataClass>) {
                val news = response.body()
                if (news != null) {
                    Log.e("TAG", "on Problem$news")
                    adapter = NewsAdapter(applicationContext, news.articles)
                    var newsList: RecyclerView = findViewById(R.id.newsList)
                    newsList.adapter = adapter
                    newsList.layoutManager = LinearLayoutManager(applicationContext)
                }
            }

            override fun onFailure(call: Call<NewsDataClass>, t: Throwable) {
                Log.e("TAG", "onFailure: ")
            }
        })
    }
}