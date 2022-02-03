package com.example.myapplication.roomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

//entities is use to know which database is going to use
//Before Migration
//@Database(entities = [Contact::class], version = 1)
//After Migration
@Database(entities = [Contact::class], version = 2)
@TypeConverters(Convertors::class)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDao

    companion object {
        //Whenever value is assign all the thread come to know there is updated value in the variable. That wise Volatile is used.
        @Volatile
        private var INSTANCE: ContactDatabase? = null

        val migration1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }
        }

        fun getDatabase(context: Context): ContactDatabase {
            if (INSTANCE == null) {
                //Synchronized is doesn't allow the different concurrent thread to make instance.
                //Using Synchronized only one instance is created
                synchronized(this) {
                    //First context then database class then database table name
                    INSTANCE =
                        Room.databaseBuilder(
                            context.applicationContext,
                            ContactDatabase::class.java, "contact"
                        ).addMigrations(migration1_2).build()
                }
            }
            return INSTANCE!!
        }
    }
}
