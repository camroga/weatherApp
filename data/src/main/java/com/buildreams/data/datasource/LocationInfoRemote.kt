package com.buildreams.data.datasource

import com.buildreams.data.model.location.LocationInfo
import retrofit2.http.GET

interface LocationInfoRemote {
    @GET("points/37.2883,-121.8434")
    suspend fun call(): LocationInfo
}
