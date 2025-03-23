package ir.hajkarami.paging3cachingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import dagger.hilt.android.AndroidEntryPoint
import ir.hajkarami.paging3cachingcompose.presentation.BeerScreen
import ir.hajkarami.paging3cachingcompose.presentation.BeerViewModel
import ir.hajkarami.paging3cachingcompose.ui.theme.Paging3CachingComposeTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paging3CachingComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel = hiltViewModel<BeerViewModel>()
                    val beers = viewModel.beerPagingFlow.collectAsLazyPagingItems()
                    BeerScreen(beers = beers)
                }
            }
        }
    }
}
