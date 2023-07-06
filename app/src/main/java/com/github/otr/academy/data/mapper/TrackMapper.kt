package com.github.otr.academy.data.mapper

import com.github.otr.academy.data.converter.HtmlConverter
import com.github.otr.academy.data.dto.track.TrackDTO
import com.github.otr.academy.domain.entitiy.Track

/**
 *
 */
class TrackMapper(
    private val htmlConverter: HtmlConverter = HtmlConverter // TODO: Replace with Inject
) : GenericMapper<TrackDTO, Track> {

    override fun mapDtoToDomainEntity(dto: TrackDTO): Track {
        if (
            dto.id != null && dto.title != null && dto.description != null
            && dto.longDescription != null && dto.isBeta != null && dto.isFree != null
            && dto.projectsByLevel != null
            && dto.secondsToComplete != null && dto.topicsCount != null && dto.cover != null
            && dto.capstoneTopicsCount != null
        ) {
            val parsedLongDesc: String = htmlConverter.convertFromHtmlToText(dto.longDescription)

            return Track(
                id = dto.id,
                title = dto.title,
                description = dto.description,
                longDescription = parsedLongDesc,
                isBeta = dto.isBeta,
                isFree = dto.isFree,
                easyProjects = dto.projectsByLevel.easy,
                mediumProjects = dto.projectsByLevel.medium,
                hardProjects = dto.projectsByLevel.hard,
                challengingProjects = dto.projectsByLevel.nightmare,
                betaProjects = dto.betaProjects,
                capstoneProjects = dto.capstoneProjects,
                projects = dto.projects,
                coverUrl = dto.cover,
                secondsToComplete = dto.secondsToComplete,
                topicsCount = dto.topicsCount,
                capstoneTopicsCount = dto.capstoneTopicsCount
            )
        } else {
            throw IllegalArgumentException("Some DTO fields are null")
        }

    }

}
