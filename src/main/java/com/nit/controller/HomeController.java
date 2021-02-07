package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.bean.Candidate;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/home")
	public void home() {
		this.homePage();
	}

	@GetMapping("/form")
	public String goToFormPage(Model model) {
		model.addAttribute("candidate", new Candidate());
		return "form";
	}

	

}
