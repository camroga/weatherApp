package com.buildreams.pokemons.domain.repository

import com.buildreams.data.model.forecast.Forecast
import com.buildreams.pokemons.data.datasource.ForecastRemote
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ForecastRepository @Inject constructor(private val forecastRemote: ForecastRemote) {
    fun get(url: String): Flow<Forecast> = flow {
        emit(forecastRemote.call(url))
    }
}
