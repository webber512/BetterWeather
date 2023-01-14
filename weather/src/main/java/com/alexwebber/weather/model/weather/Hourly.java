
package com.alexwebber.weather.model.weather;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Generated;

import com.alexwebber.weather.util.WindUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dt", "temp", "feels_like", "pressure", "humidity", "dew_point", "uvi", "clouds", "visibility",
		"wind_speed", "wind_deg", "wind_gust", "weather", "pop" })
@Generated("jsonschema2pojo")
public class Hourly {

	@JsonProperty("dt")
	private String dt;
	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("feels_like")
	private Double feelsLike;
	@JsonProperty("pressure")
	private Integer pressure;
	@JsonProperty("humidity")
	private Integer humidity;
	@JsonProperty("dew_point")
	private Double dewPoint;
	@JsonProperty("uvi")
	private Double uvi;
	@JsonProperty("clouds")
	private Integer clouds;
	@JsonProperty("visibility")
	private Integer visibility;
	@JsonProperty("wind_speed")
	private Double windSpeed;
	@JsonProperty("wind_deg")
	private Integer windDeg;
	@JsonProperty("wind_gust")
	private Double windGust;
	@JsonProperty("weather")
	private List<Weather__1> weather = null;
	@JsonProperty("pop")
	private Double pop;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private String main;
	private String windDirection;

	@JsonProperty("dt")
	public String getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Integer dt) {
		Locale.setDefault(Locale.US);
		Format sdf = new SimpleDateFormat("EEEE M/dd h:mm aa");
		this.dt = sdf.format(new Date(dt * 1000L));
	}

	@JsonProperty("temp")
	public Double getTemp() {
		return temp;
	}

	@JsonProperty("temp")
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	@JsonProperty("feels_like")
	public Double getFeelsLike() {
		return feelsLike;
	}

	@JsonProperty("feels_like")
	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	@JsonProperty("pressure")
	public Integer getPressure() {
		return pressure;
	}

	@JsonProperty("pressure")
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	@JsonProperty("humidity")
	public Integer getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("dew_point")
	public Double getDewPoint() {
		return dewPoint;
	}

	@JsonProperty("dew_point")
	public void setDewPoint(Double dewPoint) {
		this.dewPoint = dewPoint;
	}

	@JsonProperty("uvi")
	public Double getUvi() {
		return uvi;
	}

	@JsonProperty("uvi")
	public void setUvi(Double uvi) {
		this.uvi = uvi;
	}

	@JsonProperty("clouds")
	public Integer getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}

	@JsonProperty("visibility")
	public Integer getVisibility() {
		return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	@JsonProperty("wind_speed")
	public Double getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("wind_speed")
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	@JsonProperty("wind_deg")
	public Integer getWindDeg() {
		return windDeg;
	}

	@JsonProperty("wind_deg")
	public void setWindDeg(Integer windDeg) {
		this.windDeg = windDeg;
	}

	@JsonProperty("wind_gust")
	public Double getWindGust() {
		return windGust;
	}

	@JsonProperty("wind_gust")
	public void setWindGust(Double windGust) {
		this.windGust = windGust;
	}

	@JsonProperty("weather")
	public List<Weather__1> getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(List<Weather__1> weather) {
		this.weather = weather;
	}

	@JsonProperty("pop")
	public Double getPop() {
		return pop;
	}

	@JsonProperty("pop")
	public void setPop(Double pop) {
		this.pop = pop;
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
		return this.windDirection = "Hourly [dt=" + dt + ", temp=" + temp + ", feelsLike=" + feelsLike + ", pressure="
				+ pressure + ", humidity=" + humidity + ", dewPoint=" + dewPoint + ", uvi=" + uvi + ", clouds=" + clouds
				+ ", visibility=" + visibility + ", windSpeed=" + windSpeed + ", windDeg=" + windDeg + ", windGust="
				+ windGust + ", weather=" + weather + ", pop=" + pop + ", additionalProperties=" + additionalProperties
				+ "]";
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = weather.get(0).getDescription();
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection() {
		this.windDirection = WindUtil.calculateWindDirection(getWindDeg());
	}

}
