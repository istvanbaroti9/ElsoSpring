package com.elsospring.controller;

import com.elsospring.Person;
import com.elsospring.service.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// 1. approach of dep inject
	//@Autowired
	//private SpyGirl spicy;

	// 2. approach of dep inject
	//private SpyGirl spicy;
	//@Autowired
	//public void setSpicy(SpyGirl spicy) {
	//	this.spicy = spicy;
	//}

	// 3. approach of dep inject
	//private SpyGirl spicy;
	//@Autowired
	//public HomeController(SpyGirl spicy) {
	//	this.spicy = spicy;
	//}

	private SpyService spyService;

	@Autowired
	public void setSpyService(SpyService spyService) {
		this.spyService = spyService;
	}

	@Value("${HomeController.msg}")
	private String message;

	@RequestMapping("/")
	public String index() {

		//return "Sziaasztok Lányok, Fiúk!";
		return "bármi" + " " + spyService.iSaySomething() + " " + message + new Person().toString();
	}
}
