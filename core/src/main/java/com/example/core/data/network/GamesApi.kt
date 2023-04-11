package com.example.core.data.network

import com.example.core.data.network.response.Game
import retrofit2.http.GET

interface GamesApi {

    @GET("games")
    suspend fun getGames() : List<Game>

}