package ir.hajkarami.paging3cachingcompose.domain

data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val firstBrewed: String,
    val description: String,
    val imageUrl: String?
)