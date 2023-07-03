package com.github.otr.academy.data.dto.project

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class ProjectContainerDTO(

    @SerializedName("projects")
    val projects: ArrayList<ProjectDTO>

)
