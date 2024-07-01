package com.example.parcial2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.parcial2.model.Album
import com.example.parcial2.model.AlbumRepo

class AlbumViewModel : ViewModel() {
    private val _albums = MutableLiveData<List<Album>>()
    val albums: LiveData<List<Album>> get() = _albums

    init {
        // Load the album data
        loadAlbums()
    }

    private fun loadAlbums() {
        // Fetch the album list from the repository
        _albums.value = AlbumRepo.listAlbum
    }
}