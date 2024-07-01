package com.example.parcial2.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcial2.adapter.AlbumAdapter
import com.example.parcial2.model.Album
import com.example.parcial2.databinding.ActivityMainBinding
import com.example.parcial2.viewmodel.AlbumViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val albumViewModel: AlbumViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        albumViewModel.albums.observe(this) { albums ->
            initRecyclerView(albums)
        }
    }


    fun initRecyclerView(albums: List<Album>) {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.RecyclerAlbum.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.RecyclerAlbum.adapter = AlbumAdapter(albums) { album -> onItemSelected(album) }
        binding.RecyclerAlbum.addItemDecoration(decoration)
    }
    fun onItemSelected(album: Album){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("album_cover", album.cover)
        intent.putStringArrayListExtra("song_list", ArrayList(album.songs))
        startActivity(intent)
    }


}