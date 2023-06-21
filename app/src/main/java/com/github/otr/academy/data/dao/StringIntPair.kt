package com.github.otr.academy.data.dao

/**
 * A custom class to retrieve a pair of database Columns
 * one of them is String and other is Int
 * `SELECT title as first, count as second FROM table;`
 * field names should match the aliases of the column names
 * we picked with the SELECT operation
 */
data class StringIntPair(
    val first: String,
    val second: Int
)
