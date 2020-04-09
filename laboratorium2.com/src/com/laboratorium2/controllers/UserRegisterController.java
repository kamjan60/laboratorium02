package com.laboratorium2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserRegisterController {
	

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
