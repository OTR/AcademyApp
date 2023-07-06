package com.github.otr.academy.data.dto.track

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class TracksContainerDTO(

    @SerializedName("tracks" )
    val tracks : ArrayList<TrackDTO> = arrayListOf()

)
