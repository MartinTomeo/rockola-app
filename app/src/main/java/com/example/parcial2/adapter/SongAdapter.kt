package com.example.parcial2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial2.R


class SongAdapter(private val songList: List<String>, private val albumCover: String) :RecyclerView.Adapter<SongViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SongViewHolder(layoutInflater.inflate(R.layout.item_song, parent, false))
    }

    override fun getItemCount(): Int = songList.size

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val songTitle = songList[position]
        holder.songNameTextView.text = songTitle
        Glide.with(holder.itemView.context).load(albumCover).into(holder.coverImageView)

    }



}