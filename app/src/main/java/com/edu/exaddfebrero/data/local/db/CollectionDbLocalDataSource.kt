package com.edu.exaddfebrero.data.local.db

import com.edu.exaddfebrero.domain.Collection

class CollectionDbLocalDataSource(private val collectionDao: CollectionDao) {

    fun getCollections(): List<Collection>{
        val collections = collectionDao.getCollections()

        return collections.map { collection ->
            collection.toModel()
        }
    }

    fun getCollectionById(collectionId: String): Collection {
        val collections = collectionDao.getCollections()
        var collection = Collection("", "", emptyList())

        collections.map {
            if (it.id == collectionId) {
                collection = it.toModel()
            }
        }
        return collection
    }

    fun saveCollections(collections: List<Collection>){
        val collectionsEntity =collections.map { collection ->
            collection.toEntity()
        }

        collectionDao.saveCollections(collectionsEntity)
    }

    fun deleteCollectionById(collectionId: String){
        val collections = collectionDao.getCollections()

        collections.map { collection ->
            if (collection.id == collectionId) {
                collectionDao.deleteCollection(collection)
            }
        }
    }

    fun deleteMushroomById(collectionId: String, mushroomId: String) {

    }
}