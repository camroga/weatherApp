package com.buildreams.data.model.forecast

import com.squareup.moshi.Json

data class ForecastDto(
    @Json(name = "properties") val properties: ForecastProperties,
)
