package com.myproject.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPITestController {
	private static final Logger logger = LoggerFactory.getLogger(RestAPITestController.class);
	
//	RestAPI GET 호출 방식 1
	@RequestMapping(value = "/restapitest/get", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String restAPITest_GET() throws JSONException {
		logger.info("Welcome home! The client locale is {}.", "GET");
		JSONObject json = new JSONObject();
        json.put("success", true);
        json.put("data", 10);
        return json.toString(4);
	}
//	RestAPI GET 호출 방식 2
	@GetMapping(path="/restapitest/get2")
	public String restAPITest_GET2() {
		logger.info("Welcome home! The client locale is {}.", "GET2");
		String sResult = "GETsResult";
		return sResult;
	}
	
//	RestAPI POST 호출 방식 1
	@RequestMapping(value = "/restapitest/post", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public String restAPITest_POST() throws JSONException{
		logger.info("Welcome home! The client locale is {}.", "POST");
		JSONObject json = new JSONObject();
        
        try {
			json.put("success", true);
			json.put("data", 10);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return json.toString(4);
	}
//	RestAPI POST 호출 방식 2
	@PostMapping(path="/restapitest/post2")
	public String restAPITest_POST2() {
		logger.info("Welcome home! The client locale is {}.", "POST2");
		String sResult = "POSTsResult";
		return sResult;
	}
}
