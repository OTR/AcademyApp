package com.github.otr.academy.domain.entitiy

/**
 *
 */
data class Project(
    val id: Int,
    val title: String,
    val description: String,
    val longDescription: String,
    val environment: String,
    val language: String,
    val isBeta: Boolean,
    val isTemplateBased: Boolean,
    val useIde: Boolean,
    val isPublic: Boolean,
    val isIdeRequired: Boolean,
    val stagesCount: Int,
    val stagesIds: List<Int>,
    val readiness: Int
)
