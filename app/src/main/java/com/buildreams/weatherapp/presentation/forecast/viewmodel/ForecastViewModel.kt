package com.buildreams.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.buildreams.data.model.forecast.Forecast
import com.buildreams.domain.usecase.GetForecastUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ForecastViewModel @Inject constructor(private val forecastUseCase: GetForecastUseCase) :
    ViewModel() {

    private val _forecast = MutableStateFlow<Forecast?>(null)
    val forecast: StateFlow<Forecast?> get() = _forecast

    fun fetchForecast() {
        viewModelScope.launch {
            forecastUseCase.invoke().collect { result ->
                _forecast.value = result
            }
        }
    }
}
