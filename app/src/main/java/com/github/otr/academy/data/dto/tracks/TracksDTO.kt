package com.github.otr.academy.data.dto.tracks

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class TracksDTO(
    @SerializedName("tracks" )
    val tracks : ArrayList<TrackDTO> = arrayListOf()
)
