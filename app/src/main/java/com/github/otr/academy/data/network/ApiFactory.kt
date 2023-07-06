package com.github.otr.academy.data.network

import com.github.otr.academy.data.config.Config

import com.google.gson.GsonBuilder

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import java.net.URL

/**
 *
 */
object ApiFactory {

    private val BASE_URL: String = URL("http", Config.backendHost, "/").toString()
    private val gson = GsonBuilder().setLenient().create()

    val client = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build() // Create Retrofit instance
        .create(ApiEndpoints::class.java) // Create API interface
}
