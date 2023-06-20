package com.github.otr.academy.data.dto.tracks

import com.github.otr.academy.data.converter.HtmlConverter
import com.github.otr.academy.domain.entitiy.Track
import com.google.gson.annotations.SerializedName

/**
 *
 */
data class TrackDTO(

    @SerializedName("id")
    val id: Int?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("description")
    val description: String?,

    @SerializedName("results")
    val longDescription: String?,

    @SerializedName("is_beta")
    val isBeta: Boolean?,

    @SerializedName("is_free")
    val isFree: Boolean?,

    @SerializedName("projects_by_level")
    val projectsByLevel: ProjectsByLevelDTO?,

    @SerializedName("beta_projects")
    val betaProjects: ArrayList<Int> = arrayListOf(),

    @SerializedName("capstone_projects")
    val capstoneProjects: ArrayList<Int> = arrayListOf(),

    @SerializedName("projects")
    val projects: ArrayList<Int> = arrayListOf(),

    @SerializedName("cover")
    val cover: String?,

    @SerializedName("seconds_to_complete")
    val secondsToComplete: Double?,

    @SerializedName("topics_count")
    val topicsCount: Int?,

    @SerializedName("capstone_topics_count")
    val capstoneTopicsCount: Int?

) {

    fun mapToTrack(): Track {
        if (
            id != null && title != null && description != null && longDescription != null
            && isBeta != null && isFree != null && projectsByLevel != null
            && secondsToComplete != null && topicsCount != null && cover != null
            && capstoneTopicsCount != null
        ) {
            val parsedLongDesc: String = HtmlConverter.convertFromHtmlToText(longDescription)

            return Track(
                id = id,
                title = title,
                description = description,
                longDescription = parsedLongDesc,
                isBeta = isBeta,
                isFree = isFree,
                easyProjects = projectsByLevel.easy,
                mediumProjects = projectsByLevel.medium,
                hardProjects = projectsByLevel.hard,
                challengingProjects = projectsByLevel.nightmare,
                betaProjects = betaProjects,
                capstoneProjects = capstoneProjects,
                projects = projects,
                coverUrl = cover,
                secondsToComplete = secondsToComplete,
                topicsCount = topicsCount,
                capstoneTopicsCount = capstoneTopicsCount
            )
        } else {
            throw IllegalArgumentException("Some DTO fields are null")
        }
    }

}
