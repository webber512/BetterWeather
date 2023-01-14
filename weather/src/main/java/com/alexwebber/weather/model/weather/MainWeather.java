
package com.alexwebber.weather.model.weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "lat", "lon", "timezone", "timezone_offset", "current", "minutely", "hourly", "daily", "alerts" })
@Generated("jsonschema2pojo")
public class MainWeather {

	@JsonProperty("lat")
	private Double lat;
	@JsonProperty("lon")
	private Double lon;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("timezone_offset")
	private Integer timezoneOffset;
	@JsonProperty("current")
	private Current current;
	@JsonProperty("minutely")
	private List<Minutely> minutely = null;
	@JsonProperty("hourly")
	private List<Hourly> hourly = null;
	@JsonProperty("daily")
	private List<Daily> daily = null;
	@JsonProperty("alerts")
	private List<Alert> alerts = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("lat")
	public Double getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}

	@JsonProperty("lon")
	public Double getLon() {
		return lon;
	}

	@JsonProperty("lon")
	public void setLon(Double lon) {
		this.lon = lon;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@JsonProperty("timezone_offset")
	public Integer getTimezoneOffset() {
		return timezoneOffset;
	}

	@JsonProperty("timezone_offset")
	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	@JsonProperty("current")
	public Current getCurrent() {
		return current;
	}

	@JsonProperty("current")
	public void setCurrent(Current current) {
		this.current = current;
	}

	@JsonProperty("minutely")
	public List<Minutely> getMinutely() {
		return minutely;
	}

	@JsonProperty("minutely")
	public void setMinutely(List<Minutely> minutely) {
		this.minutely = minutely;
	}

	@JsonProperty("hourly")
	public List<Hourly> getHourly() {
		return hourly;
	}

	@JsonProperty("hourly")
	public void setHourly(List<Hourly> hourly) {
		this.hourly = hourly;
	}

	@JsonProperty("daily")
	public List<Daily> getDaily() {
		return daily;
	}

	@JsonProperty("daily")
	public void setDaily(List<Daily> daily) {
		this.daily = daily;
	}

	@JsonProperty("alerts")
	public List<Alert> getAlerts() {
		return alerts;
	}

	@JsonProperty("alerts")
	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "MainWeather [lat=" + lat + ", lon=" + lon + ", timezone=" + timezone + ", timezoneOffset="
				+ timezoneOffset + ", current=" + current + ", minutely=" + minutely + ", hourly=" + hourly + ", daily="
				+ daily + ", alerts=" + alerts + ", additionalProperties=" + additionalProperties + "]";
	}

}
