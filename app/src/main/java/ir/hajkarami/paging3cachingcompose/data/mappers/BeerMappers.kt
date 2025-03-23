package ir.hajkarami.paging3cachingcompose.data.mappers

import ir.hajkarami.paging3cachingcompose.data.local.BeerEntity
import ir.hajkarami.paging3cachingcompose.data.remote.BeerDto
import ir.hajkarami.paging3cachingcompose.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}