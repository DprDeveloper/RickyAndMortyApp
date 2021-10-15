package com.dprddeveloper.rickyandmortyapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityCharacterBinding

class CharacterActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityCharacterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}