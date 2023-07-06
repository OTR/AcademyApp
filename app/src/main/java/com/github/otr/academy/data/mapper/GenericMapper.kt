package com.github.otr.academy.data.mapper

/**
 *
 */
interface GenericMapper <T, S> {

    fun mapDtoToDomainEntity(dto: T): S

}
