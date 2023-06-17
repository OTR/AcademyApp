package com.github.otr.academy.data.dto.tracks

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class ProjectsByLevelDTO(
    @SerializedName("medium")
    val medium: ArrayList<Int> = arrayListOf(),

    @SerializedName("nightmare")
    val nightmare: ArrayList<Int> = arrayListOf(),

    @SerializedName("hard")
    val hard: ArrayList<Int> = arrayListOf(),

    @SerializedName("easy")
    val easy: ArrayList<Int> = arrayListOf()
)
