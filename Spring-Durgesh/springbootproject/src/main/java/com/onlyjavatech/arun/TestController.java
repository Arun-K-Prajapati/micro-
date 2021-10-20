package com.onlyjavatech.arun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ResponseBody
public class TestController {
	
	@RequestMapping("/test")
	public String firstHandler() {
		
		return "Just for Testing !!";
	}

}
