package com.buildreams.pokemons.domain.usecase

import com.buildreams.data.model.location.LocationInfo
import com.buildreams.pokemons.domain.repository.LocationInfoRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetLocationInfoUseCase @Inject constructor(private val repository: LocationInfoRepository) {
    suspend operator fun invoke(id: Int): Flow<LocationInfo> {
        return repository.call()
    }
}