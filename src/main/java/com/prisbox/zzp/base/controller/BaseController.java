package com.prisbox.zzp.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	
	@RequestMapping(value="test")
	public String test(){
		return "welcome";
	}
	
	
	
	
}
