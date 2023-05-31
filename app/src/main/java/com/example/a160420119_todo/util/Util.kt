package com.example.a160420119_todo.util

import android.content.Context
import androidx.room.Room
import com.example.a160420119_todo.model.TodoDatabase

val DB_NAME = "newtododb"
fun buildDb(context: Context): TodoDatabase {
    val db = Room.databaseBuilder(context, TodoDatabase::class.java, DB_NAME)
        .build()
    return db
}