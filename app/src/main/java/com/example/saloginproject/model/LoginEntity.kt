package com.example.saloginproject.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class LoginEntity  {

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int = 0

    @ColumnInfo(name = "username")
    var username : String = ""

    @ColumnInfo(name = "password")
    var password : String = ""

    @ColumnInfo(name = "mobile")
    var mobile : Int = 0
}