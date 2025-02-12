package com.edu.exaddfebrero.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
    private val collectionViewModel = CollectionViewModel(collectionDataRepository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val collections = collectionViewModel.loadCollections()
        Log.d("@dev", collections.toString())
    }
}