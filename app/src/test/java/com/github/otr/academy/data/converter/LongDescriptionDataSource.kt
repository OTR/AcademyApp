package com.github.otr.academy.data.converter

import com.github.otr.academy.data.config.Config
import com.github.otr.academy.data.dto.tracks.TracksContainerDTO

import com.google.gson.Gson
import org.jsoup.Jsoup

import java.net.URL

/**
 *
 */
object LongDescriptionDataSource {

    private const val pathToTracks: String = "/api/tracks.json"

    private fun loadRawJson(): String {
        val url: String = URL("http", Config.backendHost, pathToTracks).toExternalForm()
        val data: String = Jsoup
            .connect(url)
            .ignoreContentType(true)
            .execute()
            .body()

        return data
    }

    private fun getListOfLongDescAsHtml(data: String): List<String> {
        val tracksDTO: TracksContainerDTO = Gson().fromJson(data, TracksContainerDTO::class.java)
        val listOfLongDescriptionsHTML: List<String> = tracksDTO.tracks.map { it.longDescription ?: "" }
        return listOfLongDescriptionsHTML
    }

    private fun parseListOfLongDesc(listOfDescAsHtml: List<String>): List<String> {
        val listOfLongDescriptionsText: List<String> = listOfDescAsHtml.map {
            HtmlConverter.convertFromHtmlToText(it)
        }
        return listOfLongDescriptionsText
    }

    fun getListOfLongDescriptions(): List<String> {
        val data: String = loadRawJson()
        val listOfLongDescAsHtml: List<String> = getListOfLongDescAsHtml(data)
        val listOfLongDescAsText: List<String> = parseListOfLongDesc(listOfLongDescAsHtml)
        return listOfLongDescAsText
    }

}
