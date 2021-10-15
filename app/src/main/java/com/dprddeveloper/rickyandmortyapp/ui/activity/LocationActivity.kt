package com.dprddeveloper.rickyandmortyapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}