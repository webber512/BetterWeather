package com.alexwebber.weather.service;

import java.util.List;

import com.alexwebber.weather.model.geocoding.Geocoding;

public interface GeocodingSerivce {

	public List<Geocoding> getCoordinatesFromLocation(String city, String state);

	public List<Geocoding> getCoordinatesFromLocation(String city, String state, String country);

}
