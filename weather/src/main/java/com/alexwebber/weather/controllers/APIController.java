package com.alexwebber.weather.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexwebber.weather.model.weather.Daily;
import com.alexwebber.weather.model.weather.DailyPlot;
import com.alexwebber.weather.model.weather.MainWeather;
import com.alexwebber.weather.service.WeatherService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Controller
public class APIController {

	@Autowired
	WeatherService weatherService;

	@RequestMapping(value = "/api/daily/chart", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getDailyWeatherGraphData() {
		MainWeather we = weatherService.getAllWeatherForLocation("38.953", "-94.733");
		List<Daily> dailyList = we.getDaily();
		List<JsonObject> jsonObjects = new ArrayList<JsonObject>();
		for (Daily d : dailyList) {
			JsonObject obj = new JsonObject();
			obj.addProperty("date", d.getDt());
			obj.addProperty("y_high", d.getTemp().getMax());
			obj.addProperty("y_low", d.getTemp().getMin());
			jsonObjects.add(obj);
		}

		String response = new Gson().toJson(jsonObjects).toString().replaceAll("\\\\", "");
		System.out.println(response);
		return response;
	}
}
