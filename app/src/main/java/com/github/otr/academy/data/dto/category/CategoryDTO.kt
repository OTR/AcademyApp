package com.github.otr.academy.data.dto.category

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class CategoryDTO(

    @SerializedName("id")
    val id: Int?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("description")
    val description: String?,

    @SerializedName("tracks")
    val tracks: ArrayList<Int>

)
