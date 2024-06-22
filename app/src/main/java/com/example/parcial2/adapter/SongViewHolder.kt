package com.example.parcial2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial2.R

class SongViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        val songNameTextView: TextView = itemView.findViewById(R.id.song_name)
        val coverImageView: ImageView = itemView.findViewById(R.id.cover)

    }
