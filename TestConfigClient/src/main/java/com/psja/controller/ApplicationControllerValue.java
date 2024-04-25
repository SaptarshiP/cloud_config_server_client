package com.psja.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ApplicationControllerValue {

	@Value("${testPsja.properties.first.name}")
	private String val;
	
	@RequestMapping(value = "/getDataValue")
	public String getData() {
		return val;
	}
	
}
