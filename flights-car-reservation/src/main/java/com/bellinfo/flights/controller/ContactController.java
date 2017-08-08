package com.bellinfo.flights.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.flights.dao.flights.AccountDetails;

@Controller
@RequestMapping(value="/contact")
public class ContactController {

	
		@RequestMapping(method=RequestMethod.GET)
		public String studentdata(Model model){
			AccountDetails account = new AccountDetails();
			
			model.addAttribute("account",account);
			//model.addAttribute("message", "Welcome... to the world of svnsiva");
			return "contact";
		}
		

	
	
}
