package com.example.myapplication.roomDatabase

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {

    @Insert
    suspend fun addContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("select * from contact")
    fun getContact(): LiveData<List<Contact>>
}