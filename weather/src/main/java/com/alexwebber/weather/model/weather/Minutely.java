
package com.alexwebber.weather.model.weather;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dt", "precipitation" })
@Generated("jsonschema2pojo")
public class Minutely {

	@JsonProperty("dt")
	private String dt;
	@JsonProperty("precipitation")
	private Integer precipitation;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("dt")
	public String getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Integer dt) {
		Locale.setDefault(Locale.US);
		Format sdf = new SimpleDateFormat("MM/dd/yyyy");
		this.dt = sdf.format(new Date(dt * 1000L));
	}

	@JsonProperty("precipitation")
	public Integer getPrecipitation() {
		return precipitation;
	}

	@JsonProperty("precipitation")
	public void setPrecipitation(Integer precipitation) {
		this.precipitation = precipitation;
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
		return "Minutely [dt=" + dt + ", precipitation=" + precipitation + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
