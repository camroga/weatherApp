package com.buildreams.data.model.forecast

import com.squareup.moshi.Json

data class ForecastProperties(
    @Json(name = "periods") val properties: List<ForecastPeriod>,
)
