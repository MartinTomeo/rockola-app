package com.example.parcial2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcial2.adapter.SongAdapter
import com.example.parcial2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val songList = intent.getStringArrayListExtra("song_list") ?: emptyList()
        val albumCover = intent.getStringExtra("album_cover") ?: ""
        initRecyclerView(songList, albumCover)
    }
    fun initRecyclerView(songList: List<String>, albumCover: String){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.RecyclerAlbum.layoutManager = LinearLayoutManager(this)
        binding.RecyclerAlbum.adapter = SongAdapter(songList, albumCover)
        binding.RecyclerAlbum.addItemDecoration(decoration)
    }
}