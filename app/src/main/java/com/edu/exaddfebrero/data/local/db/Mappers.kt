package com.edu.exaddfebrero.data.local.db

import com.edu.exaddfebrero.domain.Collection

fun CollectionEntity.toModel(): Collection {
    return Collection(this.id, this.name, this.mushrooms)
}

fun Collection.toEntity(): CollectionEntity{
    return CollectionEntity(this.id, this.name, this.mushrooms)
}