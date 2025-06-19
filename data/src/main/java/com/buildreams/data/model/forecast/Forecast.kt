package com.buildreams.data.model.forecast

import com.squareup.moshi.Json

data class Forecast(
    @Json(name = "properties") val properties: ForecastProperties,
)
