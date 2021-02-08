package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.bean.Candidate;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		System.out.println("INFO : homePage() got executed");
		return "home";
	}
	@GetMapping("/form")
	public String goToFormPage(Model model) {
		model.addAttribute("candidate", new Candidate());
		System.out.println("INFO : goToFormPage() got executed");
		return "form";
	}

	

}
