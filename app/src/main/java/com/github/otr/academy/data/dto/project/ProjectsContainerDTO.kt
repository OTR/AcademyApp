package com.github.otr.academy.data.dto.project

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class ProjectsContainerDTO(

    @SerializedName("projects")
    val projects: ArrayList<ProjectDTO>

)
