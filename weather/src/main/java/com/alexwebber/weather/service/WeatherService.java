package com.alexwebber.weather.service;

import com.alexwebber.weather.model.weather.MainWeather;

public interface WeatherService {

	public MainWeather getAllWeatherForLocation(String lat, String lon);

}
