package com.aks.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aks.microservice.configuration.Configuration;
import com.aks.microservice.pojo.ConfigurationLimit;

@RestController
public class LimitServicesController {

	@Autowired
	private Configuration cfg;

	@GetMapping("/limits")
	public ConfigurationLimit getLimits() {

		ConfigurationLimit cl = new ConfigurationLimit();
		cl.setMaxLimit(Long.parseLong(cfg.getMaxLimit()));
		cl.setMinLimit(Long.parseLong(cfg.getMinLimit()));
		return cl;
	}

}
