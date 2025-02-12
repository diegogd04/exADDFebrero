package com.edu.exaddfebrero.domain

interface MushroomRepository {
    fun getCollections(): List<Collection>
    fun getCollectionById(collectionId: String): Collection
    fun deleteCollectionById(collectionId: String)
    fun deleteMushroomById(collectionId: String, mushroomId: String)
}