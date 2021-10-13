package com.dprddeveloper.rickyandmortyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dprddeveloper.rickyandmortyapp.AppConfig.Companion.retrofitRequest
import com.dprddeveloper.rickyandmortyapp.adapter.RmAdapter
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityMainBinding
import com.dprddeveloper.rickyandmortyapp.model.ResponseCharacter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        val recyclerView = view.rmList
        recyclerView.layoutManager = LinearLayoutManager(this)

        GlobalScope.launch(Dispatchers.Main) {
            val response: Response<ResponseCharacter> = retrofitRequest.getAllCharacter()
            if (response.isSuccessful){
                recyclerView.adapter = response.body()?.let { RmAdapter(it.results) }
            }else {
                recyclerView.adapter = RmAdapter(emptyList())
            }
        }
    }
}