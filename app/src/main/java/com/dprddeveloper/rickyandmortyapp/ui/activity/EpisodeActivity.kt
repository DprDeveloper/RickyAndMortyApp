package com.dprddeveloper.rickyandmortyapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityEpisodeBinding

class EpisodeActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityEpisodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityEpisodeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}