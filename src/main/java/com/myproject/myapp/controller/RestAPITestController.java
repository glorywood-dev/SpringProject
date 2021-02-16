package com.myproject.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPITestController {
	private static final Logger logger = LoggerFactory.getLogger(RestAPITestController.class);
	
	@RequestMapping(value = "/restAPITest", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String restAPITest() {
		logger.info("Welcome home! The client locale is {}.", "이게모게");
//		JSONObject json = new JSONObject();
//        
//        json.put("success", true);
//        json.put("data", 10);
//        json.put(null, 10);

//        return json.toString(4);
		return "{\"result\":\"ok\"}";
	}
}
