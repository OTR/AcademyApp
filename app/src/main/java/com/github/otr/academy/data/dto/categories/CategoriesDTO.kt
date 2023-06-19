package com.github.otr.academy.data.dto.categories

import com.github.otr.academy.domain.entitiy.Category

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class CategoriesDTO(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("description")
    val description: String?,

    @SerializedName("tracks")
    val tracks: ArrayList<Int>
) {

    fun mapToCategory(): Category {
        if (
            id != null
            && title != null
            && description != null
            && tracks.isNotEmpty()
        ) {
            return Category(
                id = id,
                title = title,
                description = description,
                trackIds = tracks,
                tracksCount = tracks.size
            )
        } else {
            throw IllegalArgumentException("categoryDTO fields shouldn't be null")
        }
    }

}
