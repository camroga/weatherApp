package com.buildreams.pokemons.domain.usecase

import com.buildreams.data.model.forecast.Forecast
import com.buildreams.pokemons.domain.repository.ForecastRepository
import com.buildreams.pokemons.domain.repository.LocationInfoRepository
import jakarta.inject.Inject
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flatMapLatest

class GetForecastUseCase @Inject constructor(
    private val locationInfoRepository: LocationInfoRepository,
    private val forecastRepository: ForecastRepository
) {
    @OptIn(ExperimentalCoroutinesApi::class)
    operator fun invoke(): Flow<Forecast> {
        return locationInfoRepository.call()
            .flatMapLatest { locationInfo ->
                forecastRepository.get(url = locationInfo.properties.forecast)
            }.catch {
                //TODO
            }
    }
}