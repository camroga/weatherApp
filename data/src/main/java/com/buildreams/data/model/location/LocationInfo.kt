package com.buildreams.data.model.location

import com.squareup.moshi.Json

data class LocationInfo(
    @Json(name = "properties") val properties: LocationProperties
)
