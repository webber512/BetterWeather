package com.alexwebber.weather.service;

import java.util.List;

import com.alexwebber.weather.model.weather.Daily;
import com.alexwebber.weather.model.weather.Hourly;
import com.alexwebber.weather.model.weather.MainWeather;
import com.alexwebber.weather.model.weather.Weather;

public interface WeatherService {

	public MainWeather getAllWeatherForLocation(String lat, String lon);

}
