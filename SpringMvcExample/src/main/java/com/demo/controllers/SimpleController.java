package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Address;
import com.demo.model.Person;

@Controller
public class SimpleController {

	@Autowired
	private Person person;
	
	@Autowired
	@Qualifier("address")
	private Address address;
	
	@RequestMapping(value = "/to-test-page", method = RequestMethod.GET)
	public String getPage1(Model model){
		
		String value = "working)";
		model.addAttribute("key", value);
		return "test";
	}
	
	@RequestMapping(value = "/to-autowire-page", method = RequestMethod.GET)
	public String autowire1(Model model){
		
		model.addAttribute("key2", person.getName());
		model.addAttribute("key3", address.getCity());
		return "autowire";
	}
}
