package com.github.otr.academy.presentation.track_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.github.otr.academy.data.repository.TracksRepositoryImpl
import com.github.otr.academy.domain.entitiy.Category
import com.github.otr.academy.domain.entitiy.Track
import com.github.otr.academy.domain.repository.TracksRepository
import com.github.otr.academy.domain.usecase.GetAllTracksUseCase

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 *
 */
class TracksViewModel : ViewModel() {

    private val initialListOfTracks: List<Track> = emptyList()

    private val repository: TracksRepository = TracksRepositoryImpl()
    private val getAllTracksUseCase: GetAllTracksUseCase = GetAllTracksUseCase(repository)

    private val _trackListStateFlow: MutableStateFlow<List<Track>> = MutableStateFlow(
        value = initialListOfTracks
    )
    val trackListStateFlow: StateFlow<List<Track>> = _trackListStateFlow.asStateFlow()

    init {
        Log.d("LOG", "A NEW TRACKS VIEW MODEL CREATED")
        viewModelScope.launch {
            val trackList: List<Track> = getAllTracks()
            _trackListStateFlow.emit(value = trackList)
        }
    }

    private suspend fun getAllTracks(): List<Track> {
        return getAllTracksUseCase()
    }

    fun getTracksByCategory(category: Category): List<Track> {
        return trackListStateFlow.value.filter { it.id in category.trackIds }
    }

    fun getTrackById(trackId: Int): Track {
        println()
        return trackListStateFlow.value.first { it.id == trackId }
    }


    override fun onCleared() {
        Log.d("LOG", "View Model Destroyed")
        super.onCleared()
    }
}
