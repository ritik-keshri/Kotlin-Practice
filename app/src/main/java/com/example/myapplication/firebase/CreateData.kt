package com.example.myapplication.firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityCreateDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CreateData : AppCompatActivity() {

    private lateinit var binding: ActivityCreateDataBinding
    private lateinit var databse: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val age = binding.age.text.toString()
            val userName = binding.userName.text.toString()

            databse = FirebaseDatabase.getInstance().getReference("User")
            val user = User(firstName, lastName, age, userName)
            databse.child(userName).setValue(user).addOnSuccessListener {

                binding.firstName.text.clear()
                binding.lastName.text.clear()
                binding.age.text.clear()
                binding.userName.text.clear()
                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}