package com.example.parcial2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial2.R
import com.example.parcial2.databinding.ItemSongBinding


class SongAdapter(private val songList: List<String>, private val albumCover: String) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    inner class SongViewHolder(private val binding: ItemSongBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(songTitle: String) {
            binding.songName.text = songTitle
            Glide.with(binding.root.context).load(albumCover).into(binding.cover)

            binding.root.setOnClickListener {
                showSongDialog(songTitle)
            }
        }

        private fun showSongDialog(songTitle: String) {
            val builder = Builder(binding.root.context)
            builder.setTitle("Song Details")
            builder.setMessage("Author: \nSong: $songTitle")
            builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            builder.show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val binding = ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(binding)
    }

    override fun getItemCount(): Int = songList.size

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val songTitle = songList[position]
        holder.bind(songTitle)
    }
}