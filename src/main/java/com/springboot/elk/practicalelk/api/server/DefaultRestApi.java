package com.springboot.elk.practicalelk.api.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class DefaultRestApi {
	
	private static final Logger LOG = LoggerFactory.getLogger(DefaultRestApi.class);
	
	//@RequestMapping("/api/welcome")
	//@RequestMapping("/welcome")
	@GetMapping("/welcome")
	public String welcome() {
		var text = StringUtils.join("Hello ", "thi is ", "Spring boot ", "REST API");
//		System.out.println(text);
	    LOG.info(text);
		return "Welcome to Sping boot";
	}
	
	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
