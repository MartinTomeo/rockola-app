package com.example.parcial2.data

class AlbumRepo {
    companion object{
        val listAlbum = listOf<Album>(
            Album(title = "Ten", author = "Pearl Jam"
                ,cover = "https://upload.wikimedia.org/wikipedia/en/2/2d/PearlJam-Ten2.jpg"
                ,year = 1992
                , songs = listOf("Once",
                "Alive",
                "Slough",
                "Ocean",
                "Porch",
                "Treeline",
                "Wash",
                "Release",
                "Jeremy",
                "Black")
            ),
            Album(title = "Appetite for destruction", author = "Guns and Roses"
                ,cover = "https://upload.wikimedia.org/wikipedia/en/6/60/GunsnRosesAppetiteforDestructionalbumcover.jpg"
                ,year = 1987
                ,songs = listOf("Welcome to the Jungle",
                    "It's So Easy",
                    "Nightrain",
                    "Out ta Get Me",
                    "Mr. Brownstone",
                    "Paradise City",
                    "My Michelle",
                    "Think About You",
                    "Sweet Child o' Mine",
                    "You're Crazy",
                    "Anything Goes")
            ),
            Album(title = "De entorno", author = "Almafuerte"
                , cover = "https://upload.wikimedia.org/wikipedia/en/1/10/Del_entorno.jpg"
                ,year = 1996
                ,songs = listOf("Del entorno",
                    "Lucero del alba",
                    "Hacia el abismo",
                    "Por nacer",
                    "Amistades de tierra adentro",
                    "Los delirios del defacto",
                    "Espiando el cielo",
                    "Viejo loco",
                    "Del pasado",
                    "Y no me olvidaré"
                )
            )
        )
    }
}