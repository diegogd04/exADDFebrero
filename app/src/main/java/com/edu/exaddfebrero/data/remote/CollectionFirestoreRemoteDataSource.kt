package com.edu.exaddfebrero.data.remote

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class CollectionFirestoreRemoteDataSource {

    private val db = Firebase.firestore

    fun getCollections() {
        val collections = db.collection("collections").get().addOnSuccessListener {

        }
    }

    fun getCollectionByDocument(documentName: String) {

    }
}