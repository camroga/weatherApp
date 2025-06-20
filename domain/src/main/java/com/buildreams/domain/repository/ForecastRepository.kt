package com.buildreams.domain.repository

import com.buildreams.data.datasource.ForecastRemote
import com.buildreams.data.model.forecast.Forecast
import com.buildreams.domain.mapper.toDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import kotlinx.coroutines.flow.catch

class ForecastRepository @Inject constructor(private val forecastRemote: ForecastRemote) {
    fun get(url: String): Flow<Forecast> = flow {
        emit(forecastRemote.call(url).toDomain())
    }.catch { e ->
        println("Error fetching forecast: ${e.message}")
        throw e // or emit a fallback
    }
}
