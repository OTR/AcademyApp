package com.github.otr.academy.domain.repository

import com.github.otr.academy.domain.entitiy.Track

/**
 *
 */
interface TracksRepository {

    suspend fun getAllTracks(): List<Track>

}
