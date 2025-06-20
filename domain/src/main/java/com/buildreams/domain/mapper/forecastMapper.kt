package com.buildreams.domain.mapper

import com.buildreams.data.model.forecast.Forecast
import com.buildreams.data.model.forecast.ForecastDto

fun ForecastDto.toDomain(): Forecast {
    return Forecast(
        temperature = this.properties.properties.firstOrNull()?.temperature ?: "0.0",
    )
}