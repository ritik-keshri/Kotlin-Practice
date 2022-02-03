package com.example.myapplication.roomDatabase

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class RoomDatabaseActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_database)

        database = ContactDatabase.getDatabase(this)

        //Coroutines is made using GLobalScope.launch
        GlobalScope.launch {
            database.contactDao().addContact(Contact(0, "Ritik", "8401585664", Date(),1))
        }
    }

    fun getData(view: View) {
        database.contactDao().getContact().observe(this, Observer {
            Log.e("TAG", "getData: " + it.toString())
        })
    }
}