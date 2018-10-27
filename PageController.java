package com.app.onlineshopping2.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/index","/home"})
	public String index(ModelMap m) {
		m.addAttribute("remo", "panikimaliana yedava");
		//ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greetings","welcome to spring");
		return "page";
	}
	}
