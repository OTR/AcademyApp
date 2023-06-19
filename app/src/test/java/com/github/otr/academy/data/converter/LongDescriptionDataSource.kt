package com.github.otr.academy.data.converter

import com.github.otr.academy.data.config.Config
import com.github.otr.academy.data.dto.tracks.TracksDTO

import com.google.gson.Gson
import org.jsoup.Jsoup

import java.net.URL

/**
 *
 */
object LongDescriptionDataSource {

    private const val pathToTracks: String = "/api/tracks.json"

    fun getListOfLongDescriptions(): List<String> {
        val url: String = URL("http", Config.backendHost, pathToTracks).toExternalForm()
        val data: String = Jsoup
            .connect(url)
            .ignoreContentType(true)
            .execute()
            .body()
        val tracksDTO: TracksDTO = Gson().fromJson(data, TracksDTO::class.java)
        val listOfLongDescriptionsHTML: List<String> = tracksDTO.tracks.map { it.longDescription ?: "" }
        val listOfLongDescriptionsText: List<String> = listOfLongDescriptionsHTML.map {
            Jsoup.parse(it).text()
        }
        return listOfLongDescriptionsText
    }

}
