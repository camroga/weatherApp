package com.buildreams.pokemons.domain.repository

import com.buildreams.data.datasource.LocationInfoRemote
import com.buildreams.data.model.location.LocationInfo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LocationInfoRepository @Inject constructor(private val locationInfoRemote: LocationInfoRemote) {
    fun call(): Flow<LocationInfo> = flow {
        emit(locationInfoRemote.call())
    }
}
