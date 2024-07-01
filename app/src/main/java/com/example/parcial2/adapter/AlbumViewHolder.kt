package com.example.parcial2.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial2.model.Album
import com.example.parcial2.databinding.ItemAlbumBinding

class AlbumViewHolder (view: View): RecyclerView.ViewHolder(view){

    val binding = ItemAlbumBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit){
        binding.title.text = albumModel.title
        binding.author.text = albumModel.author
        binding.year.text = albumModel.year.toString()
        Glide.with(binding.cover.context).load(albumModel.cover).into(binding.cover)
        itemView.setOnClickListener{onClickListener(albumModel)}

    }
}