package com.buildreams.data.model.location

import com.squareup.moshi.Json

data class LocationProperties(
    @Json(name = "forecast") val forecast: String
)