package com.example.millionaire.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PlayerResultEntity(
    @PrimaryKey
    val id: Int
)