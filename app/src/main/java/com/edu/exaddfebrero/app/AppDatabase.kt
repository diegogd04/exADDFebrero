package com.edu.exaddfebrero.app

import androidx.room.Database
import androidx.room.RoomDatabase
import com.edu.exaddfebrero.data.local.db.CollectionDao
import com.edu.exaddfebrero.data.local.db.CollectionEntity

@Database(entities = [CollectionEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun collectionDao(): CollectionDao
}