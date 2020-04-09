package com.laboratorium2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserRegisterController {
	

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value="/submitRegisterForm.html", method=RequestMethod.POST)
	public ModelAndView submitRegisterForm(@RequestParam("imie") String imie, @RequestParam("nazwisko") String nazwisko){
		ModelAndView model=new ModelAndView("RegisterSuccess");
		model.addObject("msg","Podane przez Ciebie wartoœci:: Imiê:"+imie+", Nazwisko: "+nazwisko);
		return model;
		
	}
}
