package com.buildreams.pokemons.data.datasource

import com.buildreams.data.model.forecast.Forecast
import retrofit2.http.GET
import retrofit2.http.Path

interface ForecastRemote {
    @GET("{forecastUrl}")
    suspend fun call(@Path("forecastUrl") forecastUrl: String): Forecast
}
