package com.example.sideA.dto;

import lombok.Data;

@Data
public class TestDto {
	
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
