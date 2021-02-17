package com.myproject.myapp.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.myproject.myapp.model.BoardVO;

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
	public String restAPITest_GET2() throws JSONException {
		logger.info("Welcome home! The client locale is {}.", "GET2");
		List boardLists = new ArrayList();

		JSONObject jObj1 = new JSONObject();
		jObj1.put("id", 1);
		jObj1.put("title", "First Title");
		jObj1.put("contents", "Contents ONE");
		boardLists.add(jObj1);
		
		JSONObject jObj2 = new JSONObject();
		jObj2.put("id", 2);
		jObj2.put("title", "Sencond Title");
		jObj2.put("contents", "Contents TWO");
		boardLists.add(jObj2);
		
//		String sResult = "GETsResult";
		String sResult = boardLists.toString();
		logger.info("sResult", sResult);
		return sResult;
	}
	
//	RestAPI GET 호출 방식 3
	@GetMapping(path="/restapitest/get3")
	public String restAPITest_GET3() throws JSONException {
		logger.info("Welcome home! The client locale is {}.", "GET2");
		List objLists = new ArrayList();
		
		HashMap hMap1 = new HashMap();
		JSONObject jObj1 = new JSONObject();
//		hMap1.put("id", 1);
//		hMap1.put("title", "First Title");
//		hMap1.put("contents", "Contents ONE");
//		objLists.add(hMap1);
		jObj1.put("id", 1);
		jObj1.put("title", "First Title");
		jObj1.put("contents", "Contents ONE");
		objLists.add(jObj1);
		
		HashMap hMap2 = new HashMap();
		JSONObject jObj2 = new JSONObject();
//		hMap2.put("id", 2);
//		hMap2.put("title", "Sencond Title");
//		hMap2.put("contents", "Contents TWO");
//		objLists.add(hMap2);
		jObj2.put("id", 2);
		jObj2.put("title", "Sencond Title");
		jObj2.put("contents", "Contents TWO");
		objLists.add(jObj2);
		
		JSONObject chkObj = new JSONObject();
		for (int i = 0; i < objLists.size(); i++) {
//			chkObj = (JSONObject) objLists.get(i);
			logger.info("boardLists.get(i).equals(\"id\") {}", objLists.get(i));
			logger.info("boardLists.get(i).equals(\"id\") {} ", chkObj);
		}
		
//		String sResult = "GETsResult";
		String sResult = objLists.toString();
		logger.info("sResult", sResult);
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
	public String restAPITest_POST2() throws JSONException {
		logger.info("Welcome home! The client locale is {}.", "POST2");
		JSONObject json = new JSONObject();
		try {
			json.put("success", true);
			json.put("data", 10);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return json.toString(4);
	}
}
