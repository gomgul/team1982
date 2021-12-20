package com.javassem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("admin")
public class AdminLoginController {
	
	@RequestMapping("{step}.do")
	public String adminJoin(@PathVariable String step){
		return "/admin/" + step;
	}

}
