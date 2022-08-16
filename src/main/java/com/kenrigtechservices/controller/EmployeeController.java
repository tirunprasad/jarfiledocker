package com.kenrigtechservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String send(Model model) {
		String msg = "I am from controller";
		model.addAttribute("msg",msg);
		return "display";
	}
}
