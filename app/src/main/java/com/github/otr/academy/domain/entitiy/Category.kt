package com.github.otr.academy.domain.entitiy

/**
 *
 */
data class Category(
    val id: Int,
    val title: String,
    val description: String,
    val trackIds: List<Int>,
    val tracksCount: Int
)
