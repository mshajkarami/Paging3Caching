package ir.hajkarami.paging3cachingcompose.presentation

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import ir.hajkarami.paging3cachingcompose.domain.Beer

@Composable
fun BeerScreen(
    beers: LazyPagingItems<Beer>
) {
    val context = LocalContext.current
    val errorMessage = (beers.loadState.refresh as? LoadState.Error)?.error?.message

    LaunchedEffect(errorMessage) {
        errorMessage?.let {
            Toast.makeText(context, "Error: $it", Toast.LENGTH_LONG).show()
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        if (beers.loadState.refresh is LoadState.Loading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(beers.itemCount) { index ->
                    val beer = beers[index]
                    if (beer != null) {
                        BeerItem(
                            beer = beer,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
                item {
                    if (beers.loadState.append is LoadState.Loading && beers.itemCount > 0) {
                        CircularProgressIndicator()
                    }
                }
            }
        }
    }
}