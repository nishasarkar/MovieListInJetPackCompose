package com.example.movielist

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun MovieCard(movie: Movie) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor= Color.LightGray
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            MovieImage(movie)
            MovieDetails(movie)
        }
    }

}
@Composable
fun MovieImage(movie: Movie) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Card(
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .padding(6.dp),
            elevation = 4.dp,
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.Green)
        ) {
            Image(
                painter = painterResource(id = movie.pictureRes),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp),
                contentScale = ContentScale.Crop

            )
        }
    }

}

@Composable
fun MovieDetails(movie:Movie){
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = movie.name, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Hero: ${movie.hero}", style = MaterialTheme.typography.body1)
        Text(text = "Heroine: ${movie.heroine}", style = MaterialTheme.typography.body1)
    }
}