package com.examplepokedex.igormattos.tvshowapp.services.constants

class Constants private constructor(){

    object URL{
        const val BASE_URL = "https://api.themoviedb.org"
        const val POPULAR_POINT = "/3/movie/popular?api_key="
        const val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        const val UPCOMING_POINT = "/3/movie/upcoming?api_key="
        const val CAST = "/3/movie/{id}/credits?api_key="
    }
    object APIKEY{
        const val KEY = "38e916798d955f2ece239fec2cb84d59"
    }

    object BUNDLE {
        const val TYPEFILTER = "taskfilter"
    }

    object FILTER {
        const val UPCOMING = 0
        const val POPULAR = 1
    }

}