package com.edu.exaddfebrero.domain

interface CollectionRepository {
    fun getCollections(): List<Collection>
    fun getCollectionById(collectionId: String): Collection
    fun deleteCollectionById(collectionId: String)
    fun deleteMushroomById(collectionId: String, mushroomId: String)
}