package com.dprddeveloper.rickyandmortyapp.repository

import com.dprddeveloper.rickyandmortyapp.AppConfig
import com.dprddeveloper.rickyandmortyapp.model.ResponseCharacter
import com.dprddeveloper.rickyandmortyapp.model.RmCharacter
import retrofit2.Response

class Repository {

    suspend fun getAllCharacter(): List<RmCharacter>? {
        val response: Response<ResponseCharacter> = AppConfig.retrofitRequest.getAllCharacter()
        if (response.isSuccessful){
            return response.body()?.let { it.results }
        }else {
            return emptyList()
        }
    }
}