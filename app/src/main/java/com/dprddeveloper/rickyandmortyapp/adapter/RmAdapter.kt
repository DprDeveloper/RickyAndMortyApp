package com.dprddeveloper.rickyandmortyapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dprddeveloper.rickyandmortyapp.R
import com.dprddeveloper.rickyandmortyapp.databinding.RmListItemBinding
import com.dprddeveloper.rickyandmortyapp.loadUrl
import com.dprddeveloper.rickyandmortyapp.model.RmCharacter

class RmAdapter(val rmItems: List<RmCharacter>): RecyclerView.Adapter<RmAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.rm_list_item, parent,false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(rmItems[position])
    }

    override fun getItemCount(): Int = rmItems.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val view = RmListItemBinding.bind(view)
        fun bind(item: RmCharacter){
            view.name.text = item.name
            view.image.loadUrl(item.image)
        }
    }
}