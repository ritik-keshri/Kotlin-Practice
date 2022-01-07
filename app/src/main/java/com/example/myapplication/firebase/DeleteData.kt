package com.example.myapplication.firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityDeleteDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DeleteData : AppCompatActivity() {
    private lateinit var binding: ActivityDeleteDataBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeleteDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.deleteDataBtn.setOnClickListener {
            val userName = binding.userName.text.toString()
            database = FirebaseDatabase.getInstance().getReference("User")
            database.child(userName).removeValue().addOnSuccessListener {
                binding.userName.text.clear()
                Toast.makeText(this, "Deleted Succesfully", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Deletion Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}