package com.github.otr.academy.domain.repository

import com.github.otr.academy.domain.entitiy.Project

/**
 *
 */
interface ProjectRepository {

    suspend fun getProjectById(projectId: Int): Project

}
