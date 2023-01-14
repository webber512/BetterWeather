package com.alexwebber.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexwebber.weather.dao.impl.GeocodingRepository;
import com.alexwebber.weather.model.geocoding.Geocoding;
import com.alexwebber.weather.service.GeocodingSerivce;

@Service("geocodingService")
public class GeocodingServiceImpl implements GeocodingSerivce {

	@Autowired
	GeocodingRepository geocodingRepository;

	@Override
	public List<Geocoding> getCoordinatesFromLocation(String city, String state) {
		return geocodingRepository.getCoordinatesFromUSLocation(city, state);
	}

	@Override
	public List<Geocoding> getCoordinatesFromLocation(String city, String state, String country) {
		return geocodingRepository.getCoordinatesFromLocation(city, state, country);
	}

}
