package com.github.otr.academy.data.converter

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.nodes.Node

/**
 *
 */
object HtmlConverter {

    fun convert(sourceHtml: String): String {
        val parsed: Document = Jsoup.parse(sourceHtml)

        //val body: Node = parsed.selectFirst("body")?.firstChild() ?: throw RuntimeException("")
        return  parsed.body().text()
    }

}