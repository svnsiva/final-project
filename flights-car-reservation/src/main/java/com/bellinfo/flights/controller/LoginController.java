package com.bellinfo.flights.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bellinfo.flights.dao.flights.AccountDetails;
import com.bellinfo.flights.dao.flights.LoginValidation;

@Controller
public class LoginController {
	public static AccountDetails logedAd;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String postStudentData(Model model){
	
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String postStudentData2(@RequestParam String username,String pwd){
		
		LoginValidation lv = new LoginValidation();
		AccountDetails ad = lv.login(username, pwd);
		if(ad==null)
			return "login";
			//System.out.println("login failed");
		else{
			logedAd = ad;
			return "account";
		}
		
	}
}
