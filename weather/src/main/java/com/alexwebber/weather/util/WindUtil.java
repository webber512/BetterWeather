package com.alexwebber.weather.util;

public class WindUtil {

	public static boolean isBetween(int wind, int a, int b) {
		if (wind >= a && wind <= b) {
			return true;
		} else {
			return false;
		}
	}

	public static String calculateWindDirection(int windDegrees) {
		if (WindUtil.isBetween(windDegrees, 0, 20))
			return "N";
		else if (WindUtil.isBetween(windDegrees, 21, 40))
			return "NNE";
		else if (WindUtil.isBetween(windDegrees, 41, 60))
			return "NE";
		else if (WindUtil.isBetween(windDegrees, 61, 80))
			return "ENE";
		else if (WindUtil.isBetween(windDegrees, 81, 100))
			return "E";
		else if (WindUtil.isBetween(windDegrees, 101, 120))
			return "ESE";
		else if (WindUtil.isBetween(windDegrees, 121, 140))
			return "SE";
		else if (WindUtil.isBetween(windDegrees, 141, 160))
			return "SSE";
		else if (WindUtil.isBetween(windDegrees, 161, 180))
			return "S";
		else if (WindUtil.isBetween(windDegrees, 181, 200))
			return "SSW";
		else if (WindUtil.isBetween(windDegrees, 201, 220))
			return "SW";
		else if (WindUtil.isBetween(windDegrees, 221, 240))
			return "WSW";
		else if (WindUtil.isBetween(windDegrees, 241, 260))
			return "W";
		else if (WindUtil.isBetween(windDegrees, 261, 280))
			return "WNW";
		else if (WindUtil.isBetween(windDegrees, 281, 300))
			return "NW";
		else if (WindUtil.isBetween(windDegrees, 301, 321))
			return "NNW";
		else if (WindUtil.isBetween(windDegrees, 321, 360))
			return "N";
		else
			return "Error calculating wind direction: " + windDegrees;
	}

}
