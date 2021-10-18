package com.dprddeveloper.rickyandmortyapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dprddeveloper.rickyandmortyapp.AppConfig
import com.dprddeveloper.rickyandmortyapp.R
import com.dprddeveloper.rickyandmortyapp.adapter.RmAdapter
import com.dprddeveloper.rickyandmortyapp.databinding.FragmentRmListBinding
import com.dprddeveloper.rickyandmortyapp.model.ResponseCharacter
import com.dprddeveloper.rickyandmortyapp.model.RmCharacter
import com.dprddeveloper.rickyandmortyapp.repository.Repository
import com.dprddeveloper.rickyandmortyapp.viewmodel.CharacterLisViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class CharacterListFragment : Fragment() {

    private val characterListViewModel: CharacterLisViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rm_list, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewBinded = FragmentRmListBinding.bind(view)
        val recyclerView = viewBinded.rmList
        recyclerView.layoutManager = LinearLayoutManager(view.context)

        characterListViewModel.getAllCharacter()
        characterListViewModel.characterList.observe(viewLifecycleOwner, Observer {
            recyclerView.adapter = RmAdapter(it)
        })
    }
}