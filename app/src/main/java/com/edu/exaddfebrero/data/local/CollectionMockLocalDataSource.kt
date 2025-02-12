package com.edu.exaddfebrero.data.local

import com.edu.exaddfebrero.domain.Collection
import com.edu.exaddfebrero.domain.Mushroom

class CollectionMockLocalDataSource {

    private val mushroomsAvila = listOf(
        Mushroom(
            "1",
            "Boletus",
            "Marrones",
            "Es grande y está enterrada",
            false
        )
    )

    private val mushroomsSalamanca = listOf(
        Mushroom(
            "1",
            "Niscalo",
            "Anaranjado",
            "Pequeño y están juntos",
            false
        )
    )

    private val collections = listOf(
        Collection(
            "1",
            "Ávila",
            mushroomsAvila
        ),
        Collection(
            "2",
            "Salamanca",
            mushroomsSalamanca
        )
    )

    fun getCollections(): List<Collection> {
        return collections
    }
}