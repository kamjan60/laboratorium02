package com.laboratorium2.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserRegisterController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value="/submitRegisterForm.html", method=RequestMethod.POST)
	public ModelAndView submitRegisterForm( @Valid @ModelAttribute("user") User user, BindingResult result){
		if(result.hasErrors() || !user.getHaslo().equals(user.getPowthaslo())) {
			ModelAndView model = new ModelAndView("index");
			if(!user.getHaslo().equals(user.getPowthaslo())) {
				model.addObject("pwdnotmatch","Has�a nie pasuj�!");
			}
			else {
				model.addObject("pwdnotmatch","");
			}
			return model;
		}
		else {
		ModelAndView model=new ModelAndView("RegisterSuccess");
		return model;
		}
	}
}
