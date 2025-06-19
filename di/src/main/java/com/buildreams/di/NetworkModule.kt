package com.buildreams.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://api.weather.gov/points/")
            .build()
    }

//    @Provides
//    fun provideWeatherApi(retrofit: Retrofit): WeatherRemote {
//        return retrofit.create(WeatherRemote::class.java)
//    }
}
