package com.edu.exaddfebrero.data.local.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CollectionDao {

    @Query("SELECT * FROM CollectionEntity")
    fun getCollections(): List<CollectionEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCollections(vararg collections: List<CollectionEntity>)

    @Delete
    fun deleteCollection(collection: CollectionEntity)
}