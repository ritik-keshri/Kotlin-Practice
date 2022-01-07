package com.example.myapplication.firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityUpdateDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateData : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateDataBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.updateBtn.setOnClickListener {
            val userName = binding.userName.text.toString()
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastname.text.toString()
            val age = binding.age.text.toString()

            database = FirebaseDatabase.getInstance().getReference("User")
            val user = mapOf(
                "firstName" to firstName,
                "lastName" to lastName,
                "age" to age
            )

            database.child(userName).updateChildren(user).addOnSuccessListener {
                binding.userName.text.clear()
                binding.firstName.text.clear()
                binding.lastname.text.clear()
                binding.age.text.clear()
                Toast.makeText(this, "Successfully Updated", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed to Update", Toast.LENGTH_SHORT).show()
            }
        }

    }
}