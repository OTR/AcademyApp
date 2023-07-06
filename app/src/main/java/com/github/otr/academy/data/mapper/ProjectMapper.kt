package com.github.otr.academy.data.mapper

import com.github.otr.academy.data.dto.project.ProjectDTO
import com.github.otr.academy.domain.entitiy.Project

/**
 *
 */
class ProjectMapper : GenericMapper<ProjectDTO, Project> {

    override fun mapDtoToDomainEntity(dto: ProjectDTO): Project {
        if (
            dto.id != null && dto.title != null && dto.description != null
            && dto.longDescription != null && dto.environment != null && dto.language != null
            && dto.isBeta != null && dto.isTemplateBased != null && dto.useIde != null
            && dto.isPublic != null && dto.isIdeRequired != null
            && dto.stagesCount != null && dto.stagesIds.isNotEmpty() && dto.readiness != null
        ) {
            return Project(
                id = dto.id,
                title = dto.title,
                description = dto.description,
                longDescription = dto.longDescription,
                environment = dto.environment,
                language = dto.language,
                isBeta = dto.isBeta,
                isTemplateBased = dto.isTemplateBased,
                useIde = dto.useIde,
                isPublic = dto.isPublic,
                isIdeRequired = dto.isIdeRequired,
                stagesCount = dto.stagesCount,
                stagesIds = dto.stagesIds,
                readiness = dto.readiness
            )
        } else {
            throw IllegalArgumentException("Some of ProjectDTO fields are null")
        }

    }

}
