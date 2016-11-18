package com.mkyong.testng.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.testng.project.service.email.EmailGenerator;

@Controller
public class MainController {

	@Autowired
	EmailGenerator emailGenerator;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getdata() {
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("email", emailGenerator.generate());
		
		return model;
		 
	}
	
}