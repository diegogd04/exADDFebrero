package com.edu.exaddfebrero.data.local.db

import com.edu.exaddfebrero.domain.Collection

class CollectionDbLocalDataSource(private val collectionDao: CollectionDao) {

    fun getCollections(): List<Collection>{
        val collections = collectionDao.getCollections()

        return collections.map { collection ->
            collection.toModel()
        }
    }

    /*fun getCollectionById(): Collection{
        val collection = collectionDao
    }*/

    fun saveCollections(collections: List<Collection>){
        val collectionsEntity =collections.map { collection ->
            collection.toEntity()
        }

        collectionDao.saveCollections(collectionsEntity)
    }

    fun deleteCollectionById(collectionId: String){
        collectionDao.deleteCollectionById(collectionId)
    }
}