package com.github.otr.academy.data.converter

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 *
 */
class HtmlConverterTest {

    @Test
    fun testConverter() {
        val listOfDescriptions = LongDescriptionDataSource.getListOfLongDescriptions()
        listOfDescriptions.forEach {
            println(it)
            println("_________________________________________________________________________")
        }
        assertEquals(2, 2)
    }

}