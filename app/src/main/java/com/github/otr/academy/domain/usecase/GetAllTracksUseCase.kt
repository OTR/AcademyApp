package com.github.otr.academy.domain.usecase

import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.domain.repository.TracksRepository

/**
 *
 */
class GetAllTracksUseCase(
    private val repository: TracksRepository
) {

    suspend operator fun invoke(): List<Track> {
        return repository.getAllTracks()
    }

}
