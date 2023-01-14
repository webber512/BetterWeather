package com.alexwebber.weather.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexwebber.weather.model.Daily;
import com.alexwebber.weather.model.DailyPlot;
import com.alexwebber.weather.model.MainWeather;
import com.alexwebber.weather.service.WeatherService;
import com.google.gson.Gson;

@Controller
public class APIController {
	
	@Autowired
	WeatherService weatherService;
	
	@RequestMapping(value = "/api/daily/chart", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getDailyWeatherGraphData() {
    	MainWeather we = weatherService.getAllWeatherForLocation("38.953", "-94.733");
    	List<Daily> dailyList = we.getDaily();
    	List<DailyPlot> dailyPlot = new ArrayList<DailyPlot>();
    	for(Daily d : dailyList) {
    		dailyPlot.add(new DailyPlot(d.getDt(),d.getTemp().getMax(),d.getTemp().getMin()));
    	}
		Gson gson = new Gson();
		String jsonStr = gson.toJson(dailyPlot);
		StringBuilder sb = new StringBuilder();
		jsonStr.replaceAll("\\\\", "");
		sb.append(jsonStr);
		return sb.toString();
	}
}
