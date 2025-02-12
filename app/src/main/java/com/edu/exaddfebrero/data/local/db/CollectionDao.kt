package com.edu.exaddfebrero.data.local.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.edu.exaddfebrero.domain.Collection

@Dao
interface CollectionDao {

    @Query("SELECT * FROM CollectionEntity")
    fun getCollections(): List<CollectionEntity>

    @Query("SELECT * FROM CollectionEntity WHERE id LIKE collectionId")
    fun getCollection(collectionId: String): CollectionEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCollections(vararg collections: List<CollectionEntity>)

    @Delete
    fun deleteCollectionById(collection: CollectionEntity)
}