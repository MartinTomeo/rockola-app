package com.example.parcial2.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.MainActivity2
import com.example.parcial2.R
import com.example.parcial2.data.Album

class AlbumAdapter(private val albumList: List<Album>, private val onClickListener: (Album) -> Unit) :RecyclerView.Adapter<AlbumViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(layoutInflater.inflate(R.layout.item_album, parent, false))
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val item = albumList[position]
        return holder.render(item, onClickListener)
    }



}