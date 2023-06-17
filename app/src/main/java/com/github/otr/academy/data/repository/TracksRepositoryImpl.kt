package com.github.otr.academy.data.repository

import com.github.otr.academy.data.network.ApiFactory
import com.github.otr.academy.data.network.ApiEndpoints
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.domain.repository.TracksRepository

class TracksRepositoryImpl : TracksRepository {

    private val apiClient: ApiEndpoints = ApiFactory.client

    override suspend fun getAllTracks(): List<Track> {
        apiClient.getTracks().let {
            val body = it.body()
            if (it.isSuccessful && body != null) {
                return body.tracks.map { it.mapToTrack() }
            } else {
                throw RuntimeException("Response code != 200 or couldn't parse JSON")
            }
        }
    }

}
