package com.buildreams.data.datasource

import com.buildreams.data.model.forecast.ForecastDto
import retrofit2.http.GET
import retrofit2.http.Url

interface ForecastRemote {
    @GET
    suspend fun call(@Url forecastUrl: String): ForecastDto
}
