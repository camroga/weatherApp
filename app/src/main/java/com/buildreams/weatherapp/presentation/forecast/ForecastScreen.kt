package com.buildreams.presentation.pokemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.buildreams.presentation.viewmodel.ForecastViewModel

@Composable
fun ForecastScreen(forecastViewModel: ForecastViewModel = hiltViewModel()) {
    val forecast = forecastViewModel.forecast.collectAsState().value
    forecastViewModel.fetchForecast()

    val temperatureText = "$forecast°"
    val backgroundGradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF2193b0), Color(0xFF6dd5ed)) // blue gradient
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (forecast != null) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Temperature Icon",
                    tint = Color.White,
                    modifier = Modifier.size(64.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = temperatureText,
                    style = TextStyle(
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
                Text(
                    text = "Celsius",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White.copy(alpha = 0.7f)
                    )
                )
            } else {
                Text("Loading...")
            }

        }
    }
}
