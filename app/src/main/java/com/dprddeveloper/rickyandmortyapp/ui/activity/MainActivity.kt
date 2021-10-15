package com.dprddeveloper.rickyandmortyapp.ui.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dprddeveloper.rickyandmortyapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnCharacter.setOnClickListener{
            navigate<CharacterActivity>()
        }

        viewBinding.btnLocation.setOnClickListener{
            navigate<LocationActivity>()
        }

        viewBinding.btnEpisode.setOnClickListener{
            navigate<EpisodeActivity>()
        }
    }

    inline fun <reified T: Activity> navigate(){
        startActivity(Intent(applicationContext,T::class.java))
    }
}