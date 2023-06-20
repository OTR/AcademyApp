package com.github.otr.academy.data.dto.project

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class ProjectDTO(

    @SerializedName("id")
    val id: Int?,

    @SerializedName("description")
    val description: String?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("environment")
    val environment: String?,

    // Contains a link to JSON which is build.gradle file for project
    // To be solved in IDE
    // https://cogniterra.org/media/attachments/lesson/27598/additional_files.json
//    @SerializedName("ide_files")
//    val ideFiles: String?,

    @SerializedName("is_beta")
    val isBeta: Boolean?,

    @SerializedName("is_template_based")
    val isTemplateBased: Boolean?,

    @SerializedName("language")
    val language: String?,

    @SerializedName("results")
    val results: String?,

    @SerializedName("stages_count")
    val stagesCount: Int?,

    @SerializedName("stages_ids")
    val stagesIds: ArrayList<Int> = arrayListOf(),

    // TODO: Look up GSON Naming Strategy
//    @SerializedName("tracks")
//    val tracks: BelongsToTrackDTO?,

    @SerializedName("use_ide")
    val useIde: Boolean?,

    @SerializedName("readiness")
    val readiness: Int?,

    @SerializedName("is_public")
    val isPublic: Boolean?,

    @SerializedName("is_ide_required")
    val isIdeRequired: Boolean?

)
