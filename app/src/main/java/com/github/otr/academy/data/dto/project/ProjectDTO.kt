package com.github.otr.academy.data.dto.project

import com.github.otr.academy.domain.entitiy.Project
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
    val stagesIds: ArrayList<Int> = arrayListOf(),

    @SerializedName("readiness")
    val readiness: Int?,

    // TODO: Look up GSON Naming Strategy
//    @SerializedName("tracks")
//    val tracks: BelongsToTrackDTO?,

) {

    fun mapToProject(): Project {
        if (
            id != null && title != null && description != null && longDescription != null
            && environment != null && language != null
            && isBeta != null && isTemplateBased != null && useIde != null
            && isPublic != null && isIdeRequired != null
            && stagesCount != null && stagesIds.isNotEmpty() && readiness != null
        ) {
            return Project(
                id = id,
            )
        } else {
            throw IllegalArgumentException("Some of ProjectDTO fields are null")
        }
    }

}
