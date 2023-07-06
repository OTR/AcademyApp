package com.github.otr.academy.data.network

import okhttp3.OkHttpClient

import java.util.concurrent.TimeUnit

/**
 *
 */
val okHttpClient: OkHttpClient = OkHttpClient.Builder()
    .readTimeout(120, TimeUnit.SECONDS)
    .connectTimeout(120, TimeUnit.SECONDS)
    .addInterceptor { chain ->
        val resp = chain.proceed(chain.request())
        // Deal with the response code
        if (resp.code() == 200) {
            try {
                // peekBody() will not close the response
                val myJson = resp.peekBody(2048).string()
                println(myJson)
            } catch (e: Exception) {
                println("Error parse json from intercept..............")
            }
        } else {
            println(resp)
        }
        resp
    }.build()
