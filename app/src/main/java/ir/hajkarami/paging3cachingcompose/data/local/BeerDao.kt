package ir.hajkarami.paging3cachingcompose.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface BeerDao {
    @Upsert
    suspend fun upsertAll(beers: List<Unit>)

    @Query("SELECT * FROM beerentity")
    fun pagingSource(): PagingSource<Int, BeerEntity>

    @Query("DELETE FROM beerentity")
    suspend fun clearAll()
}