package com.kindsonthegenius.thymeleafapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PasteController {
	@GetMapping("/api ")
	@ResponseBody
	public String getFoos(@RequestParam String id) {
	return "ID: " + id;
	}
		@PostMapping("/api")
		@ResponseBody
		public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
		return "ID: " + fooId + " Name: " + name;
		}
		
}
