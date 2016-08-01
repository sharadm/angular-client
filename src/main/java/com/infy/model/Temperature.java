package com.infy.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Temperature {

	private String temp;
	private String temp_min;
	private String humidity;
	
	
	
	
	public String getTemp() {
		return temp+" (C)";
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getTemp_min() {
		return temp_min+" (C)";
	}
	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	
	
	
}
