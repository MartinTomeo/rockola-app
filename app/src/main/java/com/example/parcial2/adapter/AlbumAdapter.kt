package com.example.parcial2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.R
import com.example.parcial2.model.Album

class AlbumAdapter(private val albums: List<Album>, private val onItemSelected: (Album) -> Unit) :RecyclerView.Adapter<AlbumViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(layoutInflater.inflate(R.layout.item_album, parent, false))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val item = albums[position]
        return holder.render(item, onItemSelected)
    }

    override fun getItemCount(): Int = albums.size

}