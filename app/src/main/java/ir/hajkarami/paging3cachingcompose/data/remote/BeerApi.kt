package ir.hajkarami.paging3cachingcompose.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface BeerApi {

    @GET("beers")
    suspend fun getBeers(
        @Query("page") page: Int,
        @Query("per_page") pageCount: Int
    ): List<BeerDto>

    companion object {
        const val BASE_URL = "https://punkapi.online/v3/"
    }
}