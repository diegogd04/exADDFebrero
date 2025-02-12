package com.edu.exaddfebrero.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.edu.exaddfebrero.domain.Mushroom

@Entity
data class CollectionEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "mushrooms") val mushrooms: List<Mushroom>
)