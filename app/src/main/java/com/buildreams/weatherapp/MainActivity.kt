package com.buildreams.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.buildreams.presentation.pokemon.ForecastScreen
import com.buildreams.presentation.ui.theme.WeatherTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTheme {
                ForecastScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonPreview() {
    WeatherTheme {
        ForecastScreen()
    }
}