package com.github.otr.academy.data.converter

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

/**
 *
 */
object HtmlConverter {

    fun convertFromHtmlToText(sourceHtml: String): String {
        val parsed: Document = Jsoup.parse(sourceHtml)

        return  parsed.body().text()
    }

}