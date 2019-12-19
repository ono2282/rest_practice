package com.example.practice.app.controller;

import com.example.practice.app.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.app.mapper.TestMapper;

@RestController
@RequestMapping("api/sample")
public class RestApiController {

	@Autowired
	private TestMapper testmapper;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public City getCity() {
    	return testmapper.getCity();
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}