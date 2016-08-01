package com.infy.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherAggregated {
	
	private Weather weather;
	private ForecastDetails forecast;	
	
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public ForecastDetails getForecast() {
		return forecast;
	}
	public void setForecast(ForecastDetails forecast) {
		this.forecast = forecast;
	}
	
	

}
