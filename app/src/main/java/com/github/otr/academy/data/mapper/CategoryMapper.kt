package com.github.otr.academy.data.mapper

import com.github.otr.academy.data.dto.category.CategoryDTO
import com.github.otr.academy.domain.entitiy.Category

/**
 *
 */
class CategoryMapper : GenericMapper<CategoryDTO, Category> {

    override fun mapDtoToDomainEntity(dto: CategoryDTO): Category {
        if (
            dto.id != null
            && dto.title != null
            && dto.description != null
            && dto.tracks.isNotEmpty()
        ) {
            return Category(
                id = dto.id,
                title =  dto.title,
                description = dto.description,
                trackIds = dto.tracks,
                tracksCount = dto.tracks.size
            )
        } else {
            throw IllegalArgumentException("categoryDTO fields shouldn't be null")
        }
    }

}
