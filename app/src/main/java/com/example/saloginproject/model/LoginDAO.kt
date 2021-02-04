package com.example.saloginproject.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface LoginDAO {

    @Insert
    fun saveData(loginentity : LoginEntity)

    @Query("select * from LoginEntity")
    fun showData(): List<LoginEntity>
}