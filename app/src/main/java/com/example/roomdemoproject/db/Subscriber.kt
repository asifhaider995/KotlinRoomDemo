package com.example.roomdemoproject.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscriber_data_table")
data class Subscriber(val newName: String, val newEmail: String,
                      @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "subscriber_id") val id: Int
) {
    @ColumnInfo(name = "subscriber_name")
    var name : String = newName
    @ColumnInfo(name = "subscriber_email")
    val email : String = newEmail


}