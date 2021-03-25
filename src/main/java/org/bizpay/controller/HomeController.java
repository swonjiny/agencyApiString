package org.bizpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("영기~~~~~~~~~");
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Home...");
		mav.setViewName("index");
		return mav;
	}
}
