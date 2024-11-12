package com.example.misuperheroes.utils

import com.example.misuperheroes.services.SuperheroService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider {

    companion object {
        fun getRetrofit() : SuperheroService {
            val tokenApi = "ceafbf6d4409617633ba7cb7c260e9da"

            val retrofit = Retrofit.Builder()
                .baseUrl("https://superheroapi.com/api/${tokenApi}/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(SuperheroService::class.java)
        }
    }
}