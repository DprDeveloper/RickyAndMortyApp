package com.dprddeveloper.rickyandmortyapp.api

import com.dprddeveloper.rickyandmortyapp.model.ResponseCharacter
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("/character")
    suspend fun getAllCharacter(): Response<ResponseCharacter>
}