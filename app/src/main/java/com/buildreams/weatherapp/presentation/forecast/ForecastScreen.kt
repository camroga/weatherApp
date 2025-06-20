package com.buildreams.presentation.pokemon

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.buildreams.presentation.viewmodel.ForecastViewModel

@Composable
fun ForecastScreen(forecastViewModel: ForecastViewModel = hiltViewModel()) {
    val forecast = forecastViewModel.forecast.collectAsState().value
    forecastViewModel.fetchForecast()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (forecast != null) {
            Text("Current temperature: ${forecast.temperature}")
        } else {
            Text("Loading...")
        }
    }
}
