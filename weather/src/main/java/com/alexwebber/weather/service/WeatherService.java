package com.alexwebber.weather.service;

import java.util.List;

import com.alexwebber.weather.model.MainWeather;
import com.alexwebber.weather.model.Daily;
import com.alexwebber.weather.model.Hourly;
import com.alexwebber.weather.model.Weather;

public interface WeatherService {

	public MainWeather getAllWeatherForLocation(String lat, String lon);

	public Hourly getHourlyWeatherForLocation(String lat, String lon);
	// public List<Daily> getDailyWeatherForLocation(String lat, String lon);

}
