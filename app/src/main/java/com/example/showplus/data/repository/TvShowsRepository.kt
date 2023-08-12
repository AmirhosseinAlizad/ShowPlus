package com.example.showplus.data.repository

import com.example.showplus.data.service.ApiService
import javax.inject.Inject

class TvShowsRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}