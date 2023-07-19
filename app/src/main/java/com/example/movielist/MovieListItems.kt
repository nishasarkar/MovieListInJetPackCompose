package com.example.movielist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

@Composable
fun MovieLists() {
    val  movieList= remember {
        mutableStateListOf<Movie>(
            Movie("DDLJ", R.drawable.ddlj, "SRK", "KAJOL"),
            Movie("PATHAAN", R.drawable.pathaan, "SRK", "DEEPIKA"),
            Movie("YJHD", R.drawable.yjhd, "RK", "DEEPIKA"),

            )
    }


    LazyColumn {
        items(movieList) { movie ->
            MovieCard(movie = movie)
        }
    }
}