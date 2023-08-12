package com.example.showplus.data.service

import com.example.showplus.data.model.TvShowsResponse
import com.example.showplus.utils.Constance
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(value = Constance.END_POINT)
    suspend fun getTvShows(): Response<TvShowsResponse>
}