package com.alexwebber.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexwebber.weather.dao.impl.WeatherRepository;
import com.alexwebber.weather.model.MainWeather;
import com.alexwebber.weather.model.Daily;
import com.alexwebber.weather.model.Hourly;
import com.alexwebber.weather.model.Weather;
import com.alexwebber.weather.service.WeatherService;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	WeatherRepository weatherRepository;


	@Override
	public MainWeather getAllWeatherForLocation(String lat, String lon) {
		return weatherRepository.getAllExampleWeatherForLocation(lat, lon);
	}

	@Override
	public Hourly getHourlyWeatherForLocation(String lat, String lon) {
		return weatherRepository.getHourlyWeatherForLocation(lat, lon);
	}


}
