package com.alexwebber.weather.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexwebber.weather.dao.impl.WeatherRepository;
import com.alexwebber.weather.model.weather.MainWeather;
import com.alexwebber.weather.service.WeatherService;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherRepository weatherRepository;

	@Override
	public MainWeather getAllWeatherForLocation(String lat, String lon) {
		return weatherRepository.getAllExampleWeatherForLocation(lat, lon);
	}

}
