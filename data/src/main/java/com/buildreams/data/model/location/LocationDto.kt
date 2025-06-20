package com.buildreams.data.model.location

import com.squareup.moshi.Json

data class LocationDto(
    @Json(name = "properties") val properties: LocationProperties
)
