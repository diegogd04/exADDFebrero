package com.edu.exaddfebrero.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.edu.exaddfebrero.R
import com.edu.exaddfebrero.app.AppDatabase
import com.edu.exaddfebrero.data.CollectionDataRepository
import com.edu.exaddfebrero.data.local.CollectionMockLocalDataSource
import com.edu.exaddfebrero.data.local.db.CollectionDbLocalDataSource

class MainActivity : AppCompatActivity() {

    private val database = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java,
        "database-mushrooms"
    ).build()
    private val mock = CollectionMockLocalDataSource()
    private val db = CollectionDbLocalDataSource(database.collectionDao())
    private val collectionDataRepository = CollectionDataRepository(mock, db)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val collections = collectionDataRepository.getCollections()
        Log.d("@dev", collections.toString())
        val collection = collectionDataRepository.getCollectionById("1")
        Log.d("@dev", collection.toString())
        collectionDataRepository.deleteCollectionById("1")
    }
}