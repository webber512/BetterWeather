package com.alexwebber.weather.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.alexwebber.weather.model.weather.Daily;
import com.alexwebber.weather.model.weather.Hourly;
import com.alexwebber.weather.model.weather.MainWeather;
import com.alexwebber.weather.model.weather.Weather;

@Repository
public class WeatherRepository {

	public Weather getAllWeatherForLocation(String lat, String lon) {
		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("https://api.openweathermap.org/data/3.0/onecall?lat=" + lat
				+ "&lon=" + lon + "&units=imperial&appid=0591dee593552d56e945be2884db5134", Weather.class);
		return weather;
	}

	public MainWeather getAllExampleWeatherForLocation(String lat, String lon) {
		RestTemplate restTemplate = new RestTemplate();
		MainWeather weather = restTemplate.getForObject("https://api.openweathermap.org/data/3.0/onecall?lat=" + lat
				+ "&lon=" + lon + "&units=imperial&appid=0591dee593552d56e945be2884db5134", MainWeather.class);
		return weather;
	}

	public Hourly getHourlyWeatherForLocation(String lat, String lon) {
		RestTemplate restTemplate = new RestTemplate();
		Hourly weather = restTemplate.getForObject("https://api.openweathermap.org/data/3.0/onecall?lat=" + lat
				+ "&lon=" + lon
				+ "&units=imperial&exclude=current,minutely,daily,alerts&appid=0591dee593552d56e945be2884db5134",
				Hourly.class);
		return weather;

	}
}
