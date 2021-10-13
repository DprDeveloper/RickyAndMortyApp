package com.dprddeveloper.rickyandmortyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)
    }
}