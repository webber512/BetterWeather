package com.alexwebber.weather.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.alexwebber.weather.model.geocoding.Geocoding;
import com.alexwebber.weather.model.weather.Weather;

@Repository
public class GeocodingRepository {

	public List<Geocoding> getCoordinatesFromLocation(String city, String state, String country) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Geocoding> getCoordinatesFromUSLocation(String city, String state) {
		RestTemplate restTemplate = new RestTemplate();
		Geocoding[] geocoding = restTemplate.getForObject("http://api.openweathermap.org/geo/1.0/direct?q=" + city + ","
				+ state + "USA" + "&limit=1&appid=0591dee593552d56e945be2884db5134", Geocoding[].class);
		List<Geocoding> geo = Arrays.asList(geocoding);
		return geo;
	}

}
