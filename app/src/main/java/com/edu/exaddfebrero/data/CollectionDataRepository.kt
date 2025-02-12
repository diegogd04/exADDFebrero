package com.edu.exaddfebrero.data

import com.edu.exaddfebrero.data.local.CollectionMockLocalDataSource
import com.edu.exaddfebrero.data.local.db.CollectionDbLocalDataSource
import com.edu.exaddfebrero.domain.Collection
import com.edu.exaddfebrero.domain.CollectionRepository

class CollectionDataRepository(private val mock: CollectionMockLocalDataSource, private val db: CollectionDbLocalDataSource): CollectionRepository {

    override fun getCollections(): List<Collection> {
        val collectionsDb = db.getCollections()

        return if (collectionsDb.isEmpty()){
            val collectionsMock = mock.getCollections()

            db.saveCollections(collectionsMock)
            collectionsMock
        }else{
            collectionsDb
        }
    }

    override fun getCollectionById(collectionId: String): Collection {
        return db.getCollectionById(collectionId)
    }

    override fun deleteCollectionById(collectionId: String) {
        db.deleteCollectionById(collectionId)
    }

    override fun deleteMushroomById(collectionId: String, mushroomId: String) {

    }


}