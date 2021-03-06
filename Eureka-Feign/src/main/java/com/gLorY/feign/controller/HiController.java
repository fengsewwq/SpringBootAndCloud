package com.gLorY.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gLorY.feign.service.SchedualServiceHi;

@RestController
public class HiController {
	
	 @Autowired
	 SchedualServiceHi schedualServiceHi;
	 
	 //http://localhost:8804/hi?name=wwq
	 @RequestMapping(value = "/hi",method = RequestMethod.GET)
	 public String sayHi(@RequestParam String name){
	     return schedualServiceHi.sayHiFromClientOne(name);
	 }

}
