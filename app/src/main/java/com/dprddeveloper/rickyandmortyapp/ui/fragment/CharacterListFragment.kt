package com.dprddeveloper.rickyandmortyapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dprddeveloper.rickyandmortyapp.AppConfig
import com.dprddeveloper.rickyandmortyapp.R
import com.dprddeveloper.rickyandmortyapp.adapter.RmAdapter
import com.dprddeveloper.rickyandmortyapp.databinding.FragmentRmListBinding
import com.dprddeveloper.rickyandmortyapp.model.ResponseCharacter
import com.dprddeveloper.rickyandmortyapp.model.RmCharacter
import com.dprddeveloper.rickyandmortyapp.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class CharacterListFragment : Fragment() {
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

        GlobalScope.launch(Dispatchers.Main) {
            val dataList = withContext(Dispatchers.IO){ Repository().getAllCharacter() }
            recyclerView.adapter = dataList?.let { RmAdapter(it) }
        }
    }
}