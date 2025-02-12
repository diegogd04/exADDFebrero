package com.edu.exaddfebrero.domain

data class Collection(
    val id: String,
    val name: String,
    val mushrooms: List<Mushroom>
)