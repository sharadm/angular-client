package com.infy.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown=true)
public class Forecast {
	
	private List<ForecastDetails> list;

	public List<ForecastDetails> getList() {
		return list;
	}

	public void setList(List<ForecastDetails> list) {
		this.list = list;
	}
	
	

}
