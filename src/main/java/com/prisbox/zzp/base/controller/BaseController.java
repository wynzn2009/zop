package com.prisbox.zzp.base.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	static Logger logger = Logger.getLogger(BaseController.class);
	
	@RequestMapping(value="test")
	public String test(){
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		return "welcome";
	}
}
