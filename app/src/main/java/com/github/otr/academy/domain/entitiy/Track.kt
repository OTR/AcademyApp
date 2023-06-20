package com.github.otr.academy.domain.entitiy

/**
 *
 */
data class Track(
    val id: Int,
    val description: String,
    val title: String,
    val isBeta: Boolean,
    val isFree: Boolean,
    // val isCompleted: Boolean,

    val easyProjects: List<Int>,
    val mediumProjects: List<Int>,
    val hardProjects: List<Int>,
    val challengingProjects: List<Int>,
    val capstoneProjects: List<Int>,
    val betaProjects: List<Int>,

    val projects: List<Int>,
    val longDescription: String,
    val secondsToComplete: Double,
    val topicsCount: Int,
    val capstoneTopicsCount: Int,
    val coverUrl: String,
) {

    fun getAllProjectIds(): List<Int> {
        return projects + betaProjects
    }

}
