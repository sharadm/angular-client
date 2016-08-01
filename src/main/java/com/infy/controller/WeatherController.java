package com.infy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.infy.model.Forecast;
import com.infy.model.Weather;
import com.infy.model.WeatherAggregated;



@Controller
public class WeatherController {
	
	@RequestMapping(value = "/weather/{city}", method = RequestMethod.GET)
	public @ResponseBody
	Weather getWeather(@PathVariable String city) {
		
		RestTemplate restTemplate = new RestTemplate();

		System.out.println(" restTemplate :::" + restTemplate);
		String endpoint = "http://localhost:8080/weather/"+city;
		System.out.println(" URL --->"+endpoint);
		Weather weather = null;
		try{
		 weather = restTemplate.getForObject(
				 endpoint, Weather.class);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" Data --"+ weather);
		return weather;
		

	}
	
	@RequestMapping(value = "/forecast/{city}", method = RequestMethod.GET)
	public @ResponseBody
	Forecast getForecast(@PathVariable String city) {
		
		RestTemplate restTemplate = new RestTemplate();

		System.out.println(" restTemplate :::" + restTemplate);
		String endpoint = "http://localhost:8080/forecast/"+city;
		System.out.println(" URL --->"+endpoint);
		Forecast forecast = null;
		try{
			forecast = restTemplate.getForObject(
				 endpoint, Forecast.class);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" Data --"+ forecast);
		return forecast;
		

	}
	
	

}
