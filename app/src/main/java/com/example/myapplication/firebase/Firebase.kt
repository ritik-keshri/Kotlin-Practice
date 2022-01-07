package com.example.myapplication.firebase

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityFirebaseBinding

class Firebase : AppCompatActivity() {

    private lateinit var binding: ActivityFirebaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirebaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.create.setOnClickListener {
            val intent = Intent(this, CreateData::class.java)
            startActivity(intent)
        }

        binding.read.setOnClickListener {
            val intent = Intent(this, ReadData::class.java)
            startActivity(intent)
        }

        binding.update.setOnClickListener {
            val intent = Intent(this, UpdateData::class.java)
            startActivity(intent)
        }

        binding.delete.setOnClickListener {
            val intent = Intent(this, DeleteData::class.java)
            startActivity(intent)
        }
    }
}