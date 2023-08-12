package com.example.showplus.di.module

import com.example.showplus.data.service.ApiService
import com.example.showplus.utils.Constance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = Constance.BASE_URL

    @Provides
    @Singleton
    fun providesRetrofitInstance(BASE_URL: String): ApiService =
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
}