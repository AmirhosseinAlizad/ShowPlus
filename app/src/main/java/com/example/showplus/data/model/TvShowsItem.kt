package com.example.showplus.data.model


data class TvShowsItem(
    val genres: List<String>,
    val id: Int,
    val image: Image,
    val language: String,
    val name: String,
    val premiered: String,
    val rating: Rating,
    val runtime: Int,
    val summary: String,
    val url: String,
)
