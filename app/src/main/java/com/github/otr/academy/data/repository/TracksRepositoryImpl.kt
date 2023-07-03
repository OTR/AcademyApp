package com.github.otr.academy.data.repository

import com.github.otr.academy.data.dto.track.TrackDTO
import com.github.otr.academy.data.dto.track.TracksContainerDTO
import com.github.otr.academy.data.mapper.GenericMapper
import com.github.otr.academy.data.mapper.TrackMapper
import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.domain.repository.TracksRepository

import retrofit2.Response

class TracksRepositoryImpl(
    private val mapper: GenericMapper<TrackDTO, Track> = TrackMapper() // TODO: Replace with Inject
) : TracksRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getAllTracks(): List<Track> {
        apiClient.getTracks().let { response: Response<TracksContainerDTO> ->
            val body = response.body()
            if (response.isSuccessful && body != null) {
                return body.tracks.map {dto: TrackDTO ->
                    mapper.mapDtoToDomainEntity(dto)
                }
            } else {
                throw RuntimeException("Response code != 200 or couldn't parse JSON")
            }
        }
    }

}
