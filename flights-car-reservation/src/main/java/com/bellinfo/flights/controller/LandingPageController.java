package com.bellinfo.flights.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.flights.dao.flights.AccountDetails;

@Controller
public class LandingPageController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String landingPage(Model model){
		AccountDetails ac = new AccountDetails();
		model.addAttribute(ac);
		return "home";
	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String indexPage(Model model){
		AccountDetails ac = new AccountDetails();
		model.addAttribute(ac);		
		return "home";
	}
	
}
