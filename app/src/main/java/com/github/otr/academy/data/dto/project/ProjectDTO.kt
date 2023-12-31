package com.github.otr.academy.data.dto.project

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class ProjectDTO(

    @SerializedName("id")
    val id: Int?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("description")
    val description: String?,

    @SerializedName("results")
    val longDescription: String?,

    @SerializedName("environment")
    val environment: String?,

    @SerializedName("language")
    val language: String?,

    @SerializedName("is_beta")
    val isBeta: Boolean?,

    @SerializedName("is_template_based")
    val isTemplateBased: Boolean?,

    @SerializedName("use_ide")
    val useIde: Boolean?,

    @SerializedName("is_public")
    val isPublic: Boolean?,

    @SerializedName("is_ide_required")
    val isIdeRequired: Boolean?,

    @SerializedName("stages_count")
    val stagesCount: Int?,

    @SerializedName("stages_ids")
    val stagesIds: ArrayList<Int>,

    @SerializedName("readiness")
    val readiness: Int?,

    // TODO: Look up GSON Naming Strategy
//    @SerializedName("tracks")
//    val tracks: BelongsToTrackDTO?,

)
