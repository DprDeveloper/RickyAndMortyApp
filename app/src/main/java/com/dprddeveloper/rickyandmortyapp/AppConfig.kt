package com.dprddeveloper.rickyandmortyapp

import com.dprddeveloper.rickyandmortyapp.api.ApiClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class AppConfig {
    companion object{
        val retrofitRequest = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiClient::class.java)
    }
}