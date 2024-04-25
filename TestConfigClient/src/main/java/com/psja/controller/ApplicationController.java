package com.psja.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
public class ApplicationController {

	@Autowired
	private Environment env;
	
	@RequestMapping(value = "/getData")
	public String getData() {
		return env.getProperty("testPsja.properties.first.name");
	}
	
}
