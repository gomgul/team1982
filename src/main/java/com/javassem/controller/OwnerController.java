package com.javassem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owner")
public class OwnerController {
	
		@RequestMapping("{step}.do")
		public String userJoin(@PathVariable String step){
			return "/owner/" + step;
		}	
}
