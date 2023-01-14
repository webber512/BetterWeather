package com.alexwebber.weather.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alexwebber.weather.model.geocoding.Geocoding;
import com.alexwebber.weather.model.weather.Daily;
import com.alexwebber.weather.model.weather.Hourly;
import com.alexwebber.weather.model.weather.MainWeather;
import com.alexwebber.weather.model.weather.Weather;
import com.alexwebber.weather.service.GeocodingSerivce;
import com.alexwebber.weather.service.WeatherService;

@Controller
public class MainController {

	@Autowired
	WeatherService weatherService;
	@Autowired
	GeocodingSerivce geocodingService;

	@GetMapping(path = "/")
	public String getHome(Model model, HttpServletRequest request, HttpSession session) {
		MainWeather we = weatherService.getAllWeatherForLocation("38.953", "-94.733");
		model.addAttribute("currentTemp", we.getCurrent().getTemp());
		List<Geocoding> g = geocodingService.getCoordinatesFromLocation("Lenexa", "KS");
		System.out.println(g.get(0).getName());
		return "home";
	}

	@GetMapping(path = "/hourly")
	public String getHourly(Model model, HttpServletRequest request, HttpSession session) {
		MainWeather we = weatherService.getAllWeatherForLocation("38.953", "-94.733");
		List<Hourly> hourlyList = we.getHourly();
		for (Hourly h : hourlyList) {
			h.setWindDirection();
		}
		model.addAttribute("hourlyList", hourlyList);
		return "hourly";
	}

	@GetMapping(path = "/daily")
	public String getDaily(Model model, HttpServletRequest request, HttpSession session) {
		MainWeather we = weatherService.getAllWeatherForLocation("38.953", "-94.733");
		List<Daily> dailyList = we.getDaily();
		dailyList.remove(dailyList.size() - 1);
		model.addAttribute("dailyList", dailyList);
		return "daily";
	}
}
