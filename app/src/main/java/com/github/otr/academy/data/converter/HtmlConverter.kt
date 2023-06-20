package com.github.otr.academy.data.converter

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.nodes.Node
import org.jsoup.nodes.TextNode

/**
 *
 */
object HtmlConverter {

    fun convertFromHtmlToText(sourceHtml: String): String {
        val document: Document = Jsoup.parse(sourceHtml)
        val divElement: Element = document.selectFirst("div") ?: throw Exception("")
        val textNodes: MutableList<String> = mutableListOf()
        divElement.traverse { node, _ ->
            if (node is TextNode && node.text().trim().isNotBlank()) {
                node.parent()?.let { parent: Node ->
                    if (parent.nodeName() == "li") {
                        textNodes.add("* ${node.text().trim()}")
                    } else {
                        textNodes.add(node.text().trim())
                    }
                }
            }
        }

        return textNodes.joinToString("\n\n")
    }

}