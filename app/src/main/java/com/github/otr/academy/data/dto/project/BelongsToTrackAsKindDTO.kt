package com.github.otr.academy.data.dto.project

import com.google.gson.annotations.SerializedName

/**
 * TODO:
 */
data class BelongsToTrackAsKindDTO(

    @SerializedName("level")
    var level: String?,

    @SerializedName("kind")
    var kind: String?

)
