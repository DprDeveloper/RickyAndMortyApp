package com.dprddeveloper.rickyandmortyapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dprddeveloper.rickyandmortyapp.adapter.RmAdapter
import com.dprddeveloper.rickyandmortyapp.model.RmCharacter
import com.dprddeveloper.rickyandmortyapp.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CharacterLisViewModel: ViewModel() {

    val characterList = MutableLiveData<List<RmCharacter>>()

    fun getAllCharacter(){
        GlobalScope.launch(Dispatchers.Main) {
            characterList.postValue(withContext(Dispatchers.IO){ Repository().getAllCharacter() })
        }
    }
}