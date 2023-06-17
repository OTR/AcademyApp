package com.github.otr.academy.domain

/**
 *
 */
data class Category(
    val id: Int,
    val title: String,
    val description: String,
    val tracks: List<Int>
)
