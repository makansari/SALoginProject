package com.example.saloginproject.model

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [LoginEntity::class],version = 1)
abstract class LoginDatabase : RoomDatabase(){

    abstract fun logDao() : LoginDAO
}