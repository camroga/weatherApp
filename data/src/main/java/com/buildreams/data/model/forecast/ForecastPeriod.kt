package com.buildreams.data.model.forecast

import com.squareup.moshi.Json

data class ForecastPeriod(
    @Json(name = "temperature") val temperature: String,
)
