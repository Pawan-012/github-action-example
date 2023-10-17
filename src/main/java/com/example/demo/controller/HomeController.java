package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/get")
	public String meth01() {
		return "The first CI CD deployment pipeline";
	}

}
