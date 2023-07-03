package com.github.otr.academy.data.dto.categories

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class CategoriesContainerDTO(

    @SerializedName("track-categories" )
    val categories : ArrayList<CategoriesDTO>

)
