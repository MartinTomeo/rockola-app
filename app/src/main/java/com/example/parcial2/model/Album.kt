package com.example.parcial2.model

data class Album(
    val title:String,
    val cover:String,
    val author:String,
    val year:Int,
    val songs: List<String>
)
